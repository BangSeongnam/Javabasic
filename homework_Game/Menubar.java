package homework_Game;

import java.util.Scanner;

public class Menubar {
	Scanner sc = new Scanner(System.in);

	void menu() {
		System.out.println("게임을 시작합니다.");

		System.out.println("1.로그인 2.회원가입 3.비밀번호 변경 4. 전적보기 5.순위 보기");
		int selection = sc.nextInt();
		
		
		
		if(selection) {
			System.out.println("메뉴를 다시 선택해 주세요 1~5까지만 입력가능 ");
		}
		
		switch(selection) {
		case 1  :
			Login();
			//파일내부에 있는 정보를 가져와 입력받은 ID 값과 비교하여 로그인 가부를 결정
			//인증을 3번 실패 할시 알림과 함게 프로그램 종료 
			
			//인증 성공시 게임시작>> 가위바위보 게임 호출 
			//게임 종료후 계속할지 여부를 물음 그만할시 전적 합산하여 플레이어 개인 파일에 전적 누적 저장
			
			//게임 종료
			break;
		case 2  :
			SighIn sign = new SighIn();
			sign.SignUp();
			break;
			//사용할 이메일을 입력받아 메일 검증식을통해 사용가능한 형식인지 체크 후 사용 가능하면 
			//가입성공과 함께 그 정보를 파일을 생성해 저장 
			//ID 중복체크 (기존 파일이 있는지 없는지 체크 )
			//회원가입후 로그인창호출 >> 로그인 호출 >> 메뉴바 송출 >> 게임 시작 or 메뉴 옵션 활용 
			
			//로그인 상태로 선택시  1.승률보기 2총 게임수 보기 3 내 순위보기 메뉴 송출
			//3번 외엔 10명 플레이어의 순위를 나오게함 형식은 아이디 승률 등수 
			// 모든 랭크 및 내순위 보여준후 게임을 할것인지 여부 체크 (Y)>>게임실행 (N)>>프로그램 종료 
		case 3 :
			ChangePw();
			break;
			//로그인  >> 신규비밀번호 >> 비밀번호 비교 >> 로그인 호출 
		case 4 :
			ViewRecord();
			break;
			//ID를 입력받고 순위 출력 >> 로그인x 메인메뉴 다시 호출 
		case 5 :
			ViewRank();
			break;
			//순위를 나오게함 형식은 아이디 승률 등수 
		
		
		
		
		}

	}
}
