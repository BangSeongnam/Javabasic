package javaStudy.day5.nestedclassEx;

import java.awt.*;

/*
 * 자바의 중첩(Nested) 클래스 : 중첩클래스란, 클래스 내부에 클래스를 정의 하는것을 말합니다.
 * 먼저, 왜 이렇게 하는지에 대한 궁금증이 많을텐데, 답만 말하자면, 특정 클래스가 하는 역할이 외부와 연동되어서 즉 
 * 다른 클래스들과 연관되는 일을 하는 것이 아니라, 특정 클래스에 지역적으로 국한된 역할만 할 경우, 이렇게 중첩으로 정의 
 * 해서 해당 클래스와 밀접한 관계를 유지 하도록 하는데 목적이 있음.
 * 이런 경우, 해당 중첩클래스의 객체를 발생시키려면, 외부객체를 먼저 생성하고, 그 객체를 통해 내부 객체를 생성해야함.
 * 여튼 이런 중첩클래스는 사용 목적에 따라서 아래의 4가지로 구분되어짐
 * 
 * 1. 인스턴스 멤버 클래스 : 내부의 중첩 클래스가 외부의 멤버필드로 참여하는 경우. 이런 경우엔 외부 (OUTER) 클래스의 
 * 객체를 먼저 생성후, INNER 객체를 발생해야함. 클래스가 보여지는 형태는 OUTERCLASS$INNERCLASS 로 보여짐
 * 
 * 2.STATIC 멤버 클래스 : 내부에 중첩 클래스가 STATIC으로 선언됨, 이런 경우엔 INNER 객체는 OUTER.INNER 형태로 발생시킴
 * 일반적인 STATIC 특징을 그대로 갖음
 * 
 * 3.지역(LOCAL)클래스 : OUTER 의 특정 메서드 내부에 정의된 클래스. 이 클래스의 인스턴스는 반드시 해당메서드가 실행 되어야만
 * 발생시킬수 있음. 그래서 지역 이라고함. 표식은 OUTER $1 INNER 형태로 숫자가 붙음.
 * 
 * 4.익명클래스(ANONYMOUS) : 자바스크립트에서 본 그 익명 함수와 같음. 클래스 이름이 없이 구현체만 갖는 형식.. 이형식은 정말
 * 많이 사용하기 때문에 잘 기억 해야함.
 * 
 */
public class NestedClassExam {
	public static void main(String[] args) {
//		A a = new A();
//		a.outerDosom2();
//		A.B b= a.new B();
//		b.doSome1();
//		
//		C.D d = new C.D(); 
		
		LocalNestedEx local = new LocalNestedEx();
		local.localMethod(1);
		
		//중첩 인터페이스 예시
		Button btnOk = new Button();
		
		//버튼 클릭시 클릭 핸들링을 구현한 리스너 지정 
		class OkListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("ok 버튼이 눌렸음.");
			}
			
		}
		
		btnOk.setclickListener(new OkListener());
		
		btnOk.click();
		
	}
}
