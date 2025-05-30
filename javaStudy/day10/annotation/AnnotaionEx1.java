package javaStudy.day10.annotation;

import java.lang.reflect.Method;

/*
 * Annotation : @으로 시작되는 명령문을 통틀어 말함.
 * 이 명령문은 클래스, 인터페이스 를 컴파일, 실행할대 어떻게 처리할지를 알려주는 설정 정보임.
 * 
 * 목적
 * 
 * 1: 컴파일시 사용하는 정보 전달
 * 2: 빌드 들이 코드를 자동으로 생성하도록 정보 전달
 * 3: 실행 시 특정 기능을 처리해얄 때 정보 전달.
 * 
 * 어노테이션은 자바에서는 필수 정보임. 잘 알고 사용하는데 문제가 없어야 함.
 * 우리가 직접 정의할 일은 거의 없음. (많은 어노테이션이 이미 제공이 되어있기 때문)
 */
@yourAnnotation
@MyAnnotation(prop1 ="2")
public class AnnotaionEx1 {
	
	@yourAnnotation
	String str;
	
	public static void main(String[] args) {
		Class cls =UseAnnotation.class;
		System.out.println(cls.toString());
		
		Method[] method =cls.getDeclaredMethods();
		
		for(Method m : method) {
			PrintAnnotation[] pa = m.getAnnotationsByType(PrintAnnotation.class);
			System.out.println(pa);
		}

	}

}
