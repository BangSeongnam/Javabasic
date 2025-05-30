package javaStudy.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class FileBackUp {
	public static void main(String[] args) {
		FileInputStream fis = null;
		String pass="D:\\backend_workspace_Real\\javaStudy\\src\\javaStudy\\day9\\InputEx1.java";
		String targetFolder = "D:\\User\\";
		int BackUpFile;
		FileOutputStream DBackUp;

		try {
			fis = new FileInputStream(pass);
			DBackUp = new FileOutputStream(targetFolder+"InputEx1.java");

			byte readByte[] = new byte[100];
			while ((BackUpFile = fis.read(readByte)) != -1) {

				fis.read(readByte, 0, BackUpFile);

			}
			DBackUp.close();
			fis.close();
			System.out.println("파일 복사 완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
