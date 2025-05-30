package javaStudy.day7;
/*
 * 래퍼 클래스 : 자바의 Ptype 을  클래스로 정의한것.
 * p 타입을 객체로 만들거나, 객체내의 값을 parse 할대 사용합니다.
 * 
 */
public class WrapperExam {

	public static void main(String[] args) {
		System.out.println(Character.isAlphabetic('z'));
		System.out.println(Character.isDigit('k'));
		
		//int 의 모든 정보 Integer.
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//바쇼인롱프더
		
		//오토박싱 언박싱.. int 타입의 값이 자동으로 객체화 되거나 일반변수화 되는 과정을 말함.
		Integer ig = 1;//오토박싱...
		Integer ig2 = Integer.valueOf("1");
		
		int res =ig + 1;

	}

}
