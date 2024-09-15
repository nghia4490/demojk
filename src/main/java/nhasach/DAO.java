package nhasach;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DAO <T> {
	
	public ArrayList<T> getAll() throws SQLException;
	public void insert(T t) throws SQLException;
	public void update(T t) throws SQLException;
	public void delete(T t) throws SQLException;
	public ArrayList<T> get_id(int id) throws SQLException;
	public ArrayList<T> get_ten(String name) throws SQLException;
}
