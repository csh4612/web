package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUserInfo {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe", "jtest","ezen1234");
			Statement stmt = con.createStatement();
			
			String sql = "insert into user_info(ui_num, ui_name, ui_id, ui_pwd)";
			
//			int cnt = stmt.executeUpdate(sql + "values(1, '홍길동', 'hong', 'hong')");
//			con +=  stmt.executeUpdate(sql + "values(2, '김길동', 'kim', 'kim')");
//			con += stmt.executeUpdate(sql + "values(3, '오길동', 'oh', 'oh')");
			
//			sql += "values(3, '오길동', 'oh', 'oh')";
//			sql += "values(1, '홍길동', 'hong', 'hong')";
			sql += "values(2, '김길동', 'kim', 'kim')";
			
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "개 insert되었음");
			
			con.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}


