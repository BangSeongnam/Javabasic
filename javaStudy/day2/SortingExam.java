package javaStudy.day2;
/*
 * 아래의 로직에 맞게 코드를 작성하세요.
 * 
 * 수 세개를 입력 받습니다. 이 수를 작은수 --> 큰수로 나열하도록 하세요
 * 
 * ex> 2, 5, 1 입력되었다면, 1<= 2<= 5 이렇게 나오도록 하세요
 * 
 * ex> 1, 3, 5, ==> 1 <= 3<= 5 이렇게 나오도록 하세요.
 * 
 */

import java.util.Scanner;

public class SortingExam {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 수 입력하세요");
		String first1 = scanner.nextLine();
		int Fir = Integer.parseInt(first1);
		
		
		System.out.print("두번째 수 입력하세요");
		String sec1 = scanner.nextLine();
		int Sec = Integer.parseInt(sec1);
		
		
		System.out.print("세번째 수 입력하세요");
		String third1 = scanner.nextLine();
		int third = Integer.parseInt(third1);
		
		int temp = 0;
		
//		if( Fir >= Sec && Sec >= third) {
//			System.out.println(Fir+" <= "+ Sec+" <= "+ third);
//		}else if(Sec <= Fir && Fir <= third) {
//			System.out.println(Sec+" <= "+ Fir+" <= "+ third );
//		}else if(third <= Fir && Fir<= Sec ) {
//			System.out.println(third+" <= "+ Fir+" <= "+ Sec);
//		}else if(Sec <= third && third<=Fir ) {
//			System.out.println(Sec+" <= "+third+" <= "+Fir );
//		}
			
	
		
	
	if(Fir >= Sec && Fir>=third) {
		temp = third;
		third = Fir;
		Fir= temp;
	}else if(Sec >= Fir && Fir >= third) {
		temp = third;
		third = Sec;
		Sec = temp;
	}
	System.out.println();
	}
			
	}


