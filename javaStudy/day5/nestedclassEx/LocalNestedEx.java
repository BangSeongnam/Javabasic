package javaStudy.day5.nestedclassEx;

import javaStudy.dayStudy.admin;

/*
 * 지역 클래스 : 지역(local) 이라는 말은 중첩되는 클래스를 Outer 클래스의 
 * 메서드 내부에 정의 하는것을 말합니다. 즉 local 은 메서드를 뜻합니다.
 * 이렇게 하는 이유는 지역 클래스가 하는 일이 특정 메서드에 국한되어서 메서드가 호출될대만 수행하고 사라지게 하기 위해서 입니다.
 * 이런 지역중첩클래스도 당연히 생성자 필드 메서드를 정의 할 수 있습니다.
 * 단, 이 클래스가 수행하는 일은 지역내에서 객체를 생성하고 수행하여야 합니다.
 * 
 * 참고로 JDK17 이전에는 local 내부에는 정적필드, 메서드가 올수 없었는데, 이후부터는 허락되어집니다.
 * 
 */
public class LocalNestedEx {
	
	void localMethod(final int a) {
		//지역클래스에서 사용하는 메소드의 변수는 묵시적으로 final 입니다. 
		//때문에 값을 변경하게 되면 무조건 에러임. 
		class LocalCls{
			int f1 = 1;
			
			
			static int sf2 =2; //jdk17부터 가능함.
			
			void method1() {
				System.out.println(a);
				System.out.println("지역클래스의 method1 내용");
			}
		}
		new LocalCls().method1();
	}
	
}
