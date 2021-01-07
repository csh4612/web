package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {
	private static final String DRIVER_CLASS_NAME = "oracle.jdbc.OracleDriver";
	// final 상수, 다 대문자 보기힘들어서 단어마다 _ 를 써준다. 스네이크 
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static final String USER = "jtest";
	private static final String PASSWORD = "ezen1234";
	static {
		try {
			Class.forName(DRIVER_CLASS_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConn() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
//	public static void main(String[] args) {
//		Connection con = DBConn.getConn();
//		System.out.println("에러없으면 커넥션 잘됨");
//		
//		
//	}
}
