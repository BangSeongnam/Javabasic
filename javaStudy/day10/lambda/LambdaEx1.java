package javaStudy.day10.lambda;

import java.util.stream.IntStream;

/*
 * 자바의 람다: 익명객체 구현식을 람다로 표현한다.
 * 익명객체 구현 방법을 모르면, 이전 수업을 참고 하기 바람.
 * 
 * 자바에서는 람다는 인터페이스의 일종으로 선언 및 취급된다.
 * 단, 람다인터페이스에는 반드시 하나의 메서드만 선언할수 있다. 하나이상이 되면, 일반 인터페이스로 간주되어버린다.
 * 또한 이 인터페이스는 람다용이야 라는 의미를 컴파일러에게 알려줘야하고, 문법 검사를 하게 요청하도록 
 * @FunctionalInterface 라는 어노테이션을 선언하기도 한다.(옵셔널이기 때문에 안해도 상관은 없지만, 대부분 선언함.)
 */
@FunctionalInterface

interface MyInterface {
	void doSome();
}

public class LambdaEx1 {

	static void doSome1(MyInterface my) {
		my.doSome();
	}

	static MyInterface getMyInter() {
//		MyInterface myInter = new MyInterface() {
//			@Override
//			public void doSome() {
//				
//			}
//		};
		MyInterface myInter = () -> System.out.println("hi there");
		return myInter;

	}

	public static void main(String[] args) {

		MyInterface yours = () -> System.out.println("hi here");
		// 여기에 MyInterface 의 익명객체를 생성해 보세요
		MyInterface my = new MyInterface() {
			@Override
			public void doSome() {
				System.out.println("hi here there over there");
			}

		};
		
		MyInterface his = getMyInter();
		
		my.doSome();
		yours.doSome();
		his.doSome();
		
		doSome1(new MyInterface() {
			
			@Override
			public void doSome() {
				System.out.println("Hello World");
				
			}
		});
		doSome1(() -> System.out.println("Hello Servlet World"));
		
		
		
		
	}

}
