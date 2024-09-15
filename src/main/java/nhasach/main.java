package nhasach;

public class main {
public static void main(String[] args) {
	try {
		view v = new view();
		kh_dao dao = new kh_dao();
		kh_model md = new kh_model(dao.getAll());
		controller c = new  controller(v, md);
		c.showAll();
		
		
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
