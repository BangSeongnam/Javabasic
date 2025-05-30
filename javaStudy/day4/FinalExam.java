package javaStudy.day4;

import java.util.Arrays;

/*
 * final 키워드 : final 은 클래스, 멤버 지역변수, 메서드 파라미터, 메서드 선언문에 
 * 모두 선언 가능합니다. 
 * 
 * 이 키워드는 종합적인 개념으로는 고정시킨다라는 개념으로 생각하면 편합니다. 
 * 즉 변경 불가능하다는 뜻입니다.
 * 
 * 클래스에 붙으면, 상속 불가가 되고 
 * 필드에 붙으면 값 변경 금지가 되며
 * 메서드 선언문에 붙으면 오버라이드 금지가 되며,
 * 메서드 파라미터에 붙으면 해당 변수는 그 지역 내에선 고정값으로 유지 되어야 합니다.
 */
public class FinalExam {

	public final void doSome() {
		
	}
	//아래는 파라미터에 final 이 붙는 경우의 예시입니다.
	public void doSome(final int a,final double[] arr) {
//		a =200;//값 변경금지
		System.out.println(a);
//		arr = new double[] {1,2,3};// 객체변경금지
		arr[0]=3.14; //값은 변경가능
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		
	}
}

class MyClass extends FinalExam{
	
//	@Override
	//부모메서드가 final 이라 오버라이드 금지
//	public void doSome() {
//		
//	}
}
