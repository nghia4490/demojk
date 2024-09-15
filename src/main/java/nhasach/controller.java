package nhasach;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class controller {
	private kh_dao dao;
	private view view;
	private kh_model model;

	public controller(nhasach.view view, kh_model model) {
		super();
		this.view = view;
		this.model = model;
		dao = new kh_dao();
	}

	public void showAll() {
		view.showlistTT(model);
		view.listttTT(new fillj());
		view.themm(new them());
		view.suaa(new sua());
		view.xoaa(new xoa());
		view.ghii(new ghi());
		view.huyy(new huy());
		view.setVisible(true);
		
	}

	class fillj implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent e) {
			view.fill();

		}

	}

	class them implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			khachhang kh = view.infor();
			try {
				dao.insert(kh);
				view.showTB("them tc");
			} catch (Exception e2) {
				view.showTB(e2.toString());
			}
		}

	}

	class sua implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			khachhang kh = view.infor();
			try {
				dao.update(kh);
				view.showTB("sua tc");
			} catch (Exception e2) {
				view.showTB(e2.toString());
			}
		}

	}

	class xoa implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			khachhang kh = view.infor();
			try {
				dao.delete(kh);
				view.showTB("xoa tc");
			} catch (Exception e2) {
				view.showTB(e2.toString());
			}
		}

	}

	class huy implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			view.clearTT();
		}

	}

	class ghi implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			try {
				view.clearTT();
				view.showlistTT(new kh_model(dao.getAll()));
			} catch (Exception e2) {
				view.showTB(e2.toString());
			}
		}

	}

}
