package nhasach;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class kh_dao implements DAO<khachhang> {

	private  String all="select *from khachhang";
	private  String insert="insert into khachhang(makhach,hoten,namsinh) values(?,?,?)";
	private  String update="update khachhang set makhach=?,hoten=?,namsinh=? where id=?";
	private  String delete="delete from khachhang where id=?";
	private  String all_id="select *from khachhang where id=?";
	private  String all_name="select *from khachhang where hoten=?";

	public ArrayList<khachhang> getAll() throws SQLException {
		Connection con = kn.getconnection();
		PreparedStatement pr = null;
		ResultSet rs = null;
		ArrayList<khachhang> kh= new ArrayList<khachhang>();
		if(con!=null) {
			pr = con.prepareStatement(all);
			rs=	pr.executeQuery();

		}
		while(rs.next()) {
			khachhang k = new khachhang(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			System.out.println(k.toString());
			kh.add(k);
			
		}
		rs.close();
		pr.close();
		con.close();
		
		
		return kh;
	}

	@Override
	public void insert(khachhang t) throws SQLException {
		Connection con = kn.getconnection();
		PreparedStatement pr = null;
		
		if(con!=null) {
			pr = con.prepareStatement(insert);
			pr.setString(1, t.getMakhach());
			pr.setString(2, t.getHoten());
			pr.setString(3, t.getNamsinh());
			pr.executeUpdate();

		}
		
		pr.close();
		con.close();
		
		
		
	
		
	}

	@Override
	public void update(khachhang t) throws SQLException {
		Connection con = kn.getconnection();
		PreparedStatement pr = null;
		
		if(con!=null) {
			pr = con.prepareStatement(update);
			pr.setString(1, t.getMakhach());
			pr.setString(2, t.getHoten());
			pr.setString(3, t.getNamsinh());
			pr.setInt(4, t.getId());
			pr.executeUpdate();

		}
		
		pr.close();
		con.close();
		
		
	}

	@Override
	public void delete(khachhang t) throws SQLException {
		Connection con = kn.getconnection();
		PreparedStatement pr = null;
		
		if(con!=null) {
			pr = con.prepareStatement(delete);
		
			pr.setInt(1, t.getId());
			pr.executeUpdate();

		}
		
		pr.close();
		con.close();
		
		
	}

	@Override
	public ArrayList<khachhang> get_id(int id) throws SQLException {
		Connection con = kn.getconnection();
		PreparedStatement pr = null;
		ResultSet rs = null;
		ArrayList<khachhang> kh= new ArrayList<khachhang>();
		if(con!=null) {
			pr = con.prepareStatement(all_id);
			pr.setInt(1, id);
			rs=	pr.executeQuery();

		}
		while(rs.next()) {
			khachhang k = new khachhang(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			System.out.println(k.toString());
			kh.add(k);
			
		}
		rs.close();
		pr.close();
		con.close();
		
		
		return kh;
	}
	

	@Override
	public ArrayList<khachhang> get_ten(String name) throws SQLException {
		Connection con = kn.getconnection();
		PreparedStatement pr = null;
		ResultSet rs = null;
		ArrayList<khachhang> kh= new ArrayList<khachhang>();
		if(con!=null) {
			pr = con.prepareStatement(all_name);
			pr.setString(1, name);
			rs=	pr.executeQuery();

		}
		while(rs.next()) {
			khachhang k = new khachhang(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			System.out.println(k.toString());
			kh.add(k);
			
		}
		rs.close();
		pr.close();
		con.close();
		
		
		return kh;
	}
	
	
//	public static void main(String[] args) {
//		kh_dao dao = new kh_dao();
//		
//		khachhang k = new khachhang (5, "ZXCXZD", "aaaASDASDaa", "1999");
//		
//		try {
//			
//			dao.update(k);
//			//dao.insert(k);
//			dao.getAll();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		
//		
//	}
	
	

}
