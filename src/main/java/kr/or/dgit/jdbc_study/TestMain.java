package kr.or.dgit.jdbc_study;

import java.util.Properties;

import kr.or.dgit.erp_application_jdbc.DBCon;
import kr.or.dgit.erp_application_jdbc.LoadProperties;

public class TestMain {

	public static void main(String[] args) {
		testDBconnection();
	}

	private static void testDBconnection() {
		DBCon dbCon = DBCon.getInstance();
		System.out.println(dbCon);

		LoadProperties lp = new LoadProperties();
		Properties pro = lp.getProperties();

		System.out.printf("user %s : password %s%n", pro.getProperty("user"), pro.getProperty("password"));
	}
}
