package javaStudy.day2;

import java.util.Scanner;

public class TraningExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("이메일을 입력하세요");
		String inputEmail = scanner.nextLine();

		int atidx = -1;
		String eId, mailServer;

		if (inputEmail.indexOf('@') != -1) {
			atidx = inputEmail.indexOf('@');
			mailServer = inputEmail.substring(atidx + 1);
			eId = inputEmail.substring(0, atidx).trim();

			for (int i = 0; i < eId.length(); i++) {
				char ch = eId.charAt(i);
				char eIdFirstChar = eId.charAt(0);
				if (!(eId.length() >= 6 && eId.length() <= 10)) {
					System.out.println("이메일 ID는 6~10 자 사이여야 합니다.");
					return;
				} else if (eIdFirstChar >= '0' && eIdFirstChar <= '9') {
					System.out.println("이메일 ID는 첫자로는 숫자가 올수 없습니다.");
					return;}
				
				if (!((ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z'))) {
					System.out.println("이메일 ID는 영문자와, 숫자로만 구성되어야 합니다.");
					return;
				} else if (!((mailServer.endsWith(".com")) || (mailServer.endsWith(".net"))
						|| (mailServer.endsWith("co.kr")))) {
					System.out.println("이메일 서버가 올바르지 않아요 돌아갓");
					return;
				}
	
			}
			System.out.println(mailServer);
			System.out.println(eId);
		}

	}

}
