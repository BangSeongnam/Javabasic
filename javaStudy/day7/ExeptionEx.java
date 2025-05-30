package javaStudy.day7;

import java.util.Scanner;

public class ExeptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수 입력");
		
		int fir =Integer.parseInt(sc.next());
		
		System.out.println(fir / 0);
		
		System.out.println("GGGGG");
	}

}
