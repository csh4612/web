package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteBhcMenu {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
			Statement stmt = con.createStatement();
			
			String sql = "delete from bhc_menu where bm_name = '뿌링소떡'";			
		
			
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 삭제됨");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
