package javaStudy.dayStudy;

import java.util.Scanner;

public class sighIn {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("회원가입을 위한 id를 입력하세요");
		String id = sc.nextLine();
		
		
		System.out.print("회원가입을 위한 password를 입력하세요");
		String password = sc.nextLine();
		
		
		System.out.println("회원 가입 성공~! ");
		
		
		//새로운 인스턴스 생성
		user User = new user(id, password);
		System.out.print("id를 입력하세요");
		String loginId = sc.nextLine();
		
		System.out.print("password를 입력하세요");
		String loginPassword = sc.nextLine();
		
		boolean isLogin = User.login(loginPassword);
		
		if(isLogin)
		{
		System.out.println("로그인 성공!");	
		}
		else
		{
		System.out.println("password가 틀립니다!");
		}
		
		System.out.println("비밀번호를 다시 입력해!");
		String reType = sc.nextLine();
		
		if(reType.equals(password)) {
			System.out.println("로그인 성공!");
		}
		
		
		
	}

}
