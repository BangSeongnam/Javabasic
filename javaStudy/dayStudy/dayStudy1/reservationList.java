package javaStudy.dayStudy.dayStudy1;

import java.util.ArrayList;
import java.util.Scanner;

public class reservationList {
	
	ArrayList<String> reservationName = new ArrayList<String>();
	
	

	// 자리예약, 목록에 추가 
	public void reservation(){
		Scanner sc = new Scanner(System.in);
		System.out.println("예약자 명을 입력하여 주세요 ");
		String addCustomer = sc.nextLine();
		reservationName.add((String)addCustomer);
			
	}

	

}
