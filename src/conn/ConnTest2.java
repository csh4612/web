package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnTest2 {
	public static void main(String[]args) {
		// 단위 테스트 - 쪼개서 쓰고 실행 한번씩 하면서 확인,
		// 1. Class.forName("oracle.jdbc.OracleDriver"); 첫번째로 쓰는 것을 적고 실행
		// 2. Connection con = DriverManager.getConnection(
		//      "jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234"); 두번째 쓰고 실행
		// 3. Statement stmt = con.createStatement();
		// 4. String sql = "";
		// 5. stmt.executeQuery(sql);    이 방법을 TDD 개발방법론: Test Driven Development (테스트 주도 개발)
		//                                 Java TDD 개발방법론: (JUnit(Test Framework) 꼭 이방법을 써야 TDD개발방법론이 아님
		
		/*
		 *  DDL : Data Definition Languge 에이터의 구조를 정의하는 언어
		 *      CREATE, DROP, ALTER, TRUNCATE
		 *  DCL : Data Manipulation Language 데이터를 조작하는 언어
		 *      INSERT, UPDATE, DELETE, SELECT
		 *  DML : Data Control Language 데이터 제어하는 언어
		 *      GRANT (권한 주는 것), REVOKE (권한 뺏기),  COMMIT, ROLLBACK
		 *       //책에 따라 다름 DML + TCL 아니면 나눠서
		 *  TCL : Transaction Control Language 트렌젝션 제어하는 언어  //책에 따라 다름 DML + TCL 아니면 나눠서
		 *      COMMIT, ROLLBACK  
		 */
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
			
			Statement stmt = con.createStatement();
			String sql = "";
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
				
	}
}
