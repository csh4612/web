package jwc.db.cons;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {
		Connection con = DBConnector.open();
		
		try {
			Statement stmt = con.createStatement();
			String sql = "insert into User_info(ui_num, ui_name, ui_age)";
			
			int cnt = stmt.executeUpdate(sql + " values(1, '미선', 20)");
			cnt += stmt.executeUpdate(sql + " values(2, '용민', 21)");
			System.out.println(cnt + "개 입력됨");			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			Statement stmt = con.createStatement();
			String sql = "update User_info";
			sql += " set ui_name = '문혁',";
			sql += " ui_age = 17";
			sql += " where ui_num = 2";
			
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 업데이트 됨");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			Statement stmt = con.createStatement();
			String sql = "delete from User_info where ui_num = 1";
			
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 삭제됨");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBConnector.close(con);
		System.out.println("프로그램 정상종료");
   }
}