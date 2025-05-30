package RSProject;

import java.io.File;
import java.util.Scanner;

public class User {
	Scanner sc = new Scanner(System.in);

	private void menu() {
		System.out.println("게임을 시작합니다.");

		System.out.println("1.로그인 2.회원가입 3.비밀번호 변경 4. 전적보기 5.순위 보기");
		int selection = sc.nextInt();
		
		public static
		
		if(selection.typeOf() == int) {
			System.out.println("메뉴를 다시 선택해 주세요 1~5까지만 입력가능 ");
		}
		
		switch(selection) {
		case 1  :
			Login();
		case 2  :
			SighUp();
		case 3 :
			ChangePw();
		case 4 :
			ViewRecord();
		case 5 :
			ViewRank();
		
		
		
		
		}

	}

}
