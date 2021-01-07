package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateBhcMenu {
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
			String sql = "update bhc_menu";
			sql += " set bm_price = 4000";
			sql += " where bm_num = 4";
			
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "개 update됨");
			con.commit();
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
