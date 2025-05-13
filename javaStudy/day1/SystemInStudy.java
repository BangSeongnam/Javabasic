package javaStudy.day1;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
System.im.read() 가 입력값을 처리하기 너무 귀찮아서, 이를 향상시킨 API 인 Scanner 객체가 나옴.
이 객체를 이용하면, 콘솔로부터 입력된 값을 문자열로 쉽게 처리 가능함.
Scanner 는 사용하기전에 반드시 import java.util.Scanner 를 해야함. (알아해줌)
 */
public class SystemInStudy {
	
	public static void main(String[] args) {
		
		//아래는 scanner 객체를 생성하는 코드임.. 나중에 깊이 배울때까지 생성법만 알아두기.
		Scanner scanner = new Scanner(System.in);
	while(true) {
		System.out.print("첫 수 입력하세요");
		String first = scanner.nextLine();
		int intFir = Integer.parseInt(first);
		System.out.println("입력된 수는" + first);
		
		System.out.print("두번째 수 입력하세요");
		String sec = scanner.nextLine();
		int intSec = Integer.parseInt(sec);
		System.out.println(intFir + intSec);
		
		System.out.println("더할래?(y or n)");
		String keepGo = scanner.nextLine();
		
		//문자열내의 값을 비교할때는, String 객체의 equals() 를 사용합니다.
		//값이 같으면 true, 아니면 false 리턴,
		if(keepGo.equals("n")) {
			System.out.println("프로그램 종료함..");
			break;
		}
	}
		scanner.close();
		//JOptionPane.showInputDialog("첫수 입력 하세요");
	}

}
