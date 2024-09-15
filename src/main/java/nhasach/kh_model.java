package nhasach;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class kh_model extends AbstractTableModel {
private ArrayList<khachhang> kh;
private Object [][] data;

	public kh_model(ArrayList<khachhang> kh) {
	super();
	this.kh = kh;
	data= new Object[kh.size()][];
	for(int i=0;i<data.length;i++) {
		khachhang k = kh.get(i);
		Object[] row= {k.getId(),k.getMakhach(),k.getHoten(),k.getNamsinh()};
		data[i]= row;
	}
}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return data[0].length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}

}
