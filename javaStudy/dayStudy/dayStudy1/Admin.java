package javaStudy.dayStudy.dayStudy1;

import java.util.ArrayList;

public class Admin extends reservationList {
	ArrayList<String> Customer = new ArrayList<String>(reservationName);
	String leaveCustomer;
	
	boolean ExitCs = Customer.removeFirst() != null;
	
	
	// 생성자
	public void Customer(ArrayList Customer) {
		this.Customer = Customer;
	}
	//예약자 목록 확인 
	public void adminManage() {
		System.out.println("남아 있는 예약 수는 : " + Customer + " 입니다. ");
	}
	//자리가 나면 예약자에게 메세지 센딩 
	public void resCustomer() {
		for(int i =0; i<Customer.size(); i++) {
			
			if(ExitCs) {
				System.out.println("send message : 다음에 입장해 망할려나");
				
			}
		
		}
	}
	
	
	
}
