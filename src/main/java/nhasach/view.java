package nhasach;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionListener;

public class view extends JFrame{
	
	private JTable table;
	private JScrollPane scr;
	private JButton them,sua,xoa,huy,ghi;
	private JTextField id,ma,hoten,namsinh;
	private JPanel south, btn , txt;
	
	public view() {
		
		btn = new JPanel(new FlowLayout());
		them= new JButton("them");
		sua = new JButton("sua");
		xoa = new JButton("xoa");
		huy = new JButton("huy");
		ghi = new JButton("ghi");
		
		
		btn.add(them);
		btn.add(sua);
		btn.add(xoa);
		btn.add(huy);
		btn.add(ghi);
		
		
		txt = new  JPanel(new GridLayout(4,2));
		id = new JTextField();
		ma= new JTextField();
		 hoten = new JTextField();
		  namsinh = new JTextField();
		  
		  txt.add(new JLabel("id"));
		  txt.add(id);
		  txt.add(new JLabel("ma"));
		  txt.add(ma);
		  txt.add(new JLabel("ten"));
		  txt.add(hoten);
		  txt.add(new JLabel("date"));
		  txt.add(namsinh);
		  
		  south= new JPanel(new BorderLayout());
		  south.add(txt,BorderLayout.CENTER);
		  south.add(btn,BorderLayout.SOUTH);
		  
		 table = new JTable();
		 scr = new JScrollPane(table);
		  
		  this.setSize(500,350);
		  this.setLayout(new BorderLayout());
		  this.add(scr,BorderLayout.CENTER);
		  this.add(south,BorderLayout.SOUTH);
		  
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		  
		  
		
	}
	
	public void showTT(khachhang k) {
		id.setText(""+k.getId());
		ma.setText(""+k.getMakhach());
		hoten.setText(""+k.getHoten());
		namsinh.setText(""+k.getNamsinh());
		them.setEnabled(false);
		sua.setEnabled(true);
		xoa.setEnabled(true);
		huy.setEnabled(true);
	}
	public void clearTT() {
		id.setText("");
		ma.setText("");
		hoten.setText("");
		namsinh.setText("");
		them.setEnabled(true);
		sua.setEnabled(false);
		xoa.setEnabled(false);
		huy.setEnabled(false);
		
	}
	
	public void showTB(String t) {
		JOptionPane.showMessageDialog(this, t);
		
	}
	public void showlistTT(kh_model model) {
	table.setModel(model);
	table.getColumnModel().getColumn(0).setPreferredWidth(30);
	table.getColumnModel().getColumn(1).setPreferredWidth(50);
	table.getColumnModel().getColumn(2).setPreferredWidth(60);
	table.getColumnModel().getColumn(3).setPreferredWidth(80);
	table.getColumnModel().getColumn(0).setHeaderValue("id");
	table.getColumnModel().getColumn(1).setHeaderValue("ma");
	table.getColumnModel().getColumn(2).setHeaderValue("hoten");
	table.getColumnModel().getColumn(3).setHeaderValue("nam sinh");
	
	}
	public void fill() {
		int row = table.getSelectedRow();
		if(row>=0) {
			id.setText(table.getModel().getValueAt(row, 0).toString());
			ma.setText(table.getModel().getValueAt(row, 1).toString());
			hoten.setText(table.getModel().getValueAt(row, 2).toString());
			namsinh.setText(table.getModel().getValueAt(row, 3).toString());
			
		}
		them.setEnabled(false);
		sua.setEnabled(true);
		xoa.setEnabled(true);
		huy.setEnabled(true);
	}
	public khachhang infor() {
		khachhang kh = new khachhang();
		try {
			if(id.getText()!="" && !"".equals(id.getText())) {
				kh.setId(Integer.parseInt(id.getText()));
			}
			kh.setMakhach(ma.getText());
			kh.setHoten(hoten.getText());
			kh.setNamsinh(namsinh.getText());
			return kh;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	public void themm(ActionListener ac) {
		them.addActionListener(ac);
	}
	public void suaa(ActionListener ac) {
		sua.addActionListener(ac);
	}
	public void xoaa(ActionListener ac) {
		xoa.addActionListener(ac);
	}
	public void huyy(ActionListener ac) {
		huy.addActionListener(ac);
	}
	public void ghii(ActionListener ac) {
		ghi.addActionListener(ac);
	}
	public void listttTT(ListSelectionListener ac) {
		table.getSelectionModel().addListSelectionListener(ac);
	}
	
	
	
	
	
	
	
	
	
	

}
