package nhasach;

public class khachhang {
	private int id;
	private String makhach,hoten,namsinh;
	public khachhang(int id, String makhach, String hoten, String namsinh) {
		super();
		this.id = id;
		this.makhach = makhach;
		this.hoten = hoten;
		this.namsinh = namsinh;
	}
	public khachhang(String makhach, String hoten, String namsinh) {
		super();
		this.makhach = makhach;
		this.hoten = hoten;
		this.namsinh = namsinh;
	}
	public khachhang() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMakhach() {
		return makhach;
	}
	public void setMakhach(String makhach) {
		this.makhach = makhach;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(String namsinh) {
		this.namsinh = namsinh;
	}
	@Override
	public String toString() {
		return "khachhang [id=" + id + ", makhach=" + makhach + ", hoten=" + hoten + ", namsinh=" + namsinh + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
