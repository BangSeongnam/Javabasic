package javaStudy.day2;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		String str = null;//보통 객체 초기화 값으로 null 줌.
		str= "안녕";
		
		//null 객체의 메서드 호출
		System.out.println(str.toString());
		
		String str2 ="안녕";
		
		if(str == str2) {
			System.out.println("같은 객체입니다.. 당연히 값도 같습니다.");
		}
		
		//생성자(내일 배움)를 이용해서 같은 값의 문자열객체 생성해보기
		str2 = new String("안녕");
		if(str == str2) {
			System.out.println("같은 객체입니다.. 당연히 값도 같습니다.");
		}else {
			System.out.println("틀린 객체입니다.. 값이 같을지는 모르겠네요..");
		}
		//다른 문자열 객체간의 값이 같을지를 문자열 객체의 메서드를 이용해서 알아보자
		if (str2.equals(str2)) {
			System.out.println("같은 객체인지 모르겟지만, 값은 같네요");
		}else {
			System.out.println("같은 객체인지 모르지만, 값은 틀리네요");
		}
		
		String str3 ="ABC";
		
		String str4 ="abc";
		
		if(str3.equalsIgnoreCase(str4)) {
			System.out.println("같은 문자열 값(대소문자구분없) ");
		}
		
		System.out.println(str3.charAt(0));
		int leng = str4.length();
		
		System.out.println(leng);
		for(int i = 0; i<str4.length(); i++) {
			char ch =str4.charAt(i);
			System.out.println(ch);
		}
		
		String myName = "방성남";
		for(int i = 0; i<myName.length();i++) {
			System.out.println(myName.codePointAt(i));
			System.out.println((char)myName.codePointAt(i));
		}
		
		//concat(str) : + 와 같은 역활... 문자열을 합친 새로운 객체(instance)를 생성해서 그 ref 를 리턴시킨다.
		
		String myMail = "abc@abc.com";
		if(myMail.endsWith(".com")) {
			System.out.println(".com 으로 끝나네요");
		}
		
		System.out.println(myMail);
		/*
		 * 이메일을 입력 받아서 노가다로 검증하는 로직을 작성합니다.
		 * 이메일은 @을 기준으로 앞은 id 뒤는 메일 서버로 구분됩니다. 
		 * 때문에 @를 기준으로 분리 해야 하는데, 이때 subString() 을 이용하면 편리함.
		 * 분리된 이메일은 ID는 6~10자 사이여야 하고, 반드시 영문자와, 숫자로만 구성되어야 하며,
		 * 처자로는 숫자가 올수 없어야 합니다.
		 * 서버는 반드시 .com, net, co.kr 로 끝나야 합니다. 
		 * 이 조건을 검증하는 로직을 작성하고, 만약 위배시엔 어떤 조건을 위배했는지에 대한 내용을 콘솔에 찍어야합니다.
		 * ex>id의 첫자에 숫자가 있음.. 이럼안뎀... 뭐 이런식으로
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이메일을 입력하세요");
		String inputEmail = scanner.nextLine();
		
		
		
		int atidx = -1;
		String eId, mailServer;
		
		if(inputEmail.indexOf('@') != -1) {
			atidx = inputEmail.indexOf('@');
			mailServer = inputEmail.substring(atidx+1);
			eId = inputEmail.substring(0,atidx);
			System.out.println(mailServer);
			System.out.println(eId);
		}
		
		System.out.println(" hello ".trim().length());
		
		
		
		
		
		
		
		
	}

}
