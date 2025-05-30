package javaStudy.day10.annotation;

public @interface MyAnnotation {
	
	//아래는 어노테이션의 기능을 선언하고,
	String prop1();
	int prop2() default 1;//이건 메서드의 기본값을 1로 주겟다는 의미임.
}
