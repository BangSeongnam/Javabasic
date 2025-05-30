package javaStudy.day2;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		int draw = 0;
		while(true)
		{  
			System.out.print("가위, 바위, 보 를 입력하세요");
			String User = sc.nextLine();
			
			int random = (int) (Math.random() * 3);
			String computer;

			if (random == 0)
				computer = "가위";
			else if (random == 1)
				computer = "바위";
			else
				computer = "보";

			System.out.printf("컴퓨터:%s\n", computer);

			if (
					(User.equals("가위")&&computer.equals("가위"))||
					(User.equals("바위")&&computer.equals("바위"))||
					(User.equals("보")&&computer.equals("보"))
				) {
				draw++;
				System.out.println("무승부!");
			
			}else if(
					(User.equals("가위")&&computer.equals("보"))||
					(User.equals("바위")&&computer.equals("가위"))||
					(User.equals("보")&&computer.equals("바위"))
			) {
				win++;
				System.out.println("당신이 이겼습니다! 너:"+User+ "컴퓨터:"+computer);
			}else {
				lose++;
				System.out.println("컴퓨터 승리!!");
			}
			
			System.out.println("당신의 전적 승:"+ win +"무:"+ draw +"패:"+ lose);
			System.out.println("함더?");
			String retry = sc.nextLine().toUpperCase();//toUpperCase는 민우님 도움
			
			if(!retry.equals("Y"))
			{
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
		}
		

	}
}
