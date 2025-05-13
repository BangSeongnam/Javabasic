package javaStudy.day1;
/*
 *자바 연산자 : 자바스크립트와 완전 같음.. 순서까지 같음.
 *몇가지 차이가 있는 것만 확인하겠음. 
 */

public class OpExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//선행은 단항연산자, 후행연산자는 맨 마지막 순위입니다.
		
		int a =1;
		int b =2;
		
		int c = ++a + ++b;
		System.err.println(c);
		
		
		
		
		
		//정수형의 오버플로우, 언더플로우에 대해서...
		//오버플로우는 정수에 선, 후행 연산이 가해진후 지정된 범위의 값을 넘어설때 발생하는 오류를 뜻함.
		//하나의 예를 들면, byte 의 max 값은 127임.. 만약 128을 byte 에 초기화 하면 에러임.
		//하지만, 127을 담고, 이후 선후행 증가 연산을 하게되면, 오버플로우가 발생되어서,
		//-128로 변환이 됨.. 이러한 형태를 잘 알고 사용해야함.
		
		byte bb = 125;
		for(int i = 0; i<5; i++) {
			bb++;
			System.out.println("bb ->" +bb);
		}
		
		//정확한 계산은 정수로 하세요... float 은 부동소수점으로 처리 하기때문에 값이 변할 가능성이 있습니다.
		
		int apple = 1;
//		double pieceUnit = 0.1;
		int totalP= apple *10;
		int number = 7;
		
		double result = totalP - number;
		
		System.out.println("사과 1개에서 남은 양:" + result/10.0);
	
		
		/*
		 * ==연산자.. P type 끼리의 연산시엔 값이 같은지를 물어보고, true/ false 를 리턴하고
		 * R type 끼리 물어보면 같은 객체 즉 Reference 가 같으면 true 아니면 false 리턴함. 이거 꼭 기억하세요
		 
		 *
		 */

		int sum=0;
		
		while(true) {
			int num1=(int)(Math.random()*6)+1;
			int num2=(int)(Math.random()*6)+1;
			
			System.out.printf("첫번째 수 %1$d: 두번째 수 %2$d:",num1,num2);
			sum = num1 + num2;
			
			if(sum==5) {
				System.out.println("숫자의 합이 5입니다 프로그램을 멈춥니다");
				break;
			}
			
		}
		
//		for(int x=0; x<=10; x++ ) {
//			for(int y=0; y<=10; y++) {
//			if((4*x+5*y)==60) {
//				System.out.println(x+":"+y);
//			}
//			
//			}
//		}
		int star = 0;
		for(int i=0; i<=5; i++) {
			for(int x=0; x<i; x++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	
	}

}
