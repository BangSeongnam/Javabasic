package javaStudy.day1;
/*
 자바의 Data Type : 일반적으로 컴퓨터 언어는 메모리에 담는 값에 타입에 따라서 테이터 타입을 엄격하게 구분짓습니다.
 자바도 마찬가지 입니다.
 
 아래의 내용은 꼭 기억 하세요.
 
 제가  Java 의 데이터 타입을 크게 2개로 말하세요 라고 하면, 반드시 Primitive Type(P type - 원시 자료형)
 과 Reference Type(객체 타입) 이 존재 한다라고 하시면 됩니다. 꼭 기억하세요 !!!!
 
 자바는 100% 객체지향 언어이기 때문에 모든 프로그래밍은 R type 으로 이뤄진다고 생각하세요.
 그럼 P type 은 언제 쓰느냐? 객체 내에서 데이터 틀이 연산등을 수행을 할 때 사용되어진다고 생각하세요.
 
 P type 은 다시 값의 타입에 따라서 아래로 구분됨. 
 
 수치형 
 	1. 정수형 : byte(1byte), short(2), int(4 default), long(8)
 	2. 실수형 : float(4byte), double(8 default)
 		수치형의 리터럴값은 모두 기본형 타입의 메모리에 할당되어집니다.
 		연산시의 타입 변환 : 기본적으로 자바에서는 두 변수가 연산되어질때, 먼저 타입 검사를 합니다.
 		만약 타입이 기본타입 이하인 경우엔 무조건 기본타입으로 메모리를 할당, 복사후 연산 합니다... 꼭 기억하세요
 		만약 기본타입 이상의 경우엔 무조건 큰타입으로 복사후 연산합니다. 꼭 기억하세요.
 	
 	3. 문자형(문자 하나만 담는 타입) : char(2byte-음수 없음, 내부적으론 정수형태를 취함.. unicode 참조)
 	4. boolean : true / false !! 스크립트처럼 0 1, empty 등을 true/false 로 못담음. 그냥 true/false 만 존재함.
 	
 */

public class DataTypeExam {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		//리터럴을 이용한 예시
		System.out.println(10);//내부적으로 int 메모리 할당후 값을 대입하고 출력시키다
		System.out.println(10+2);//int int 를 생성후 + 연산후 결과를 출력시킨다
		System.out.println("파이의 값은" + 3.14);//문자열객체(String) 을 생성하고, double 메모리를 생성, 값을 할당후
		//문자열 + double 연산을 처리, 최종 결과가 문자열인 값을 출력시킨다.
		//문자열객체(String)+ 모든 data type (P and R type) 의 결과는 String 임.
		
		//변수의 타입 : 자바에서는 값이 사용되기 전엔 그 값의 타입이 반드시 먼저 선언되고, 값을 대입해야 합니다. 
		//만약 타입이 틀리거나, 범위가 벗어나면 에러 입니다. 
		//변수 선언시 주의 !! 같은 블락내에서 재선언 절대 불가함.
		
		//변수 선언 예시
		byte b1, b2, b3;
		int k=10;
		
		b1 = 10;//대입
		byte b = 1;//변수 초기화.
		
		k = b1 + b;
		
		//long 과 float 은 초기화시에 값 뒤에 L or l, F or f를 넣어줘서 처음부터 메모리를 생성한다
		long lo = 1L;
		
		
		System.out.println(Float.MAX_VALUE);
		
		float f =3.14f;
		lo = 0xAAA;
		System.out.println(lo);
		
		lo = 06123;//수 앞에 0을 사용해서 8진수 표기함.
		System.out.println(lo);
		
		// 캐스팅 연산자 : 작은 타입을 큰 타입으로 변환하도록 하는 연산자 임.
		// 캐스팅 연산자는 단항 연산자입니다. 때문에 우측항 하나에만 연산이 적용됩니다.
		// 사용 예 : byte bt = 1; byte bt2 = (byte)bt + 2;
		byte bt = 1; byte bt2 = (byte)bt + 2;
		float f2 = (float)1.0;
		
		//Fruit.class를 아래처럼 정의 하세요 
		//main 내부에 
		//아래의 로직을 정의 하고, 경과를 출력 시키세요.
		/*
		 *여러분이 과수원을 한다라고 가정합니다.
		 *재배 과일로는 사과, 배, 오렌지가 있고, 각각 하루에 3, 5, 3 생산이 되어집니다.
		 *과수원의 하루 총 생산량(과일합산) 을 출력하고, 시간당 생산량을 출력시키세요
		 *단 아래의 조건을 모두 만족해야합니다. 
		 *
		 *1.최대한의 변수를 활용하세요.
		 *2. 결과는 소숫점으로 나올겁니다.
		 *3.한번의 리터럴과, 한번의 캐스팅 연산을 사용하세요. 
		 */
		
		
		
	}
}
