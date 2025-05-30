package javaStudy.day8.collection;

import java.io.IOException;
import java.util.Properties;

public class PropertiesExam {

	public static void main(String[] args) {
		Properties properties = new Properties();

		// 프로퍼티스 파일을 읽어들임.
		try {
			properties.load(PropertiesExam.class.getResourceAsStream("db.properties"));

			String admin = properties.getProperty("admin");
			System.out.println(admin);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
