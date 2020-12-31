package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Java DataBase Connector : JDBC
// 자바로 오라클을 접근 하기 위해 사용

public class ConnTest {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");  // 오라클 데이터 베이스 선택, Class.forName 엄청 중요한데 이해하기 힘듬
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe", //로컬 호스 : 포트/ 서비스명
					"jtest","ezen1234"); //아이디, 비번
			
			con.setAutoCommit(false);
			Statement stmt = con.createStatement(); // Statement 가 코드짜는 공간, con에게 가져온다.
			
			String sql = "insert into song_intfo(si_num, si_name, si_genre, si_singer, si_creadat)";
			sql += "values(1, '애국가', 'KPOP', '우리모두', '19401201')";  // 자동저장 된다.
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "개 insert되었음");
			con.commit();
		
		} catch (SQLException e) {		
			e.printStackTrace();
		}
	}
}
