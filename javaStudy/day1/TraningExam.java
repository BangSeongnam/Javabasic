package javaStudy.day1;

public class TraningExam {

	public static void main(String[] args) {
		char ch='Z';
		for(char i='A'; i<='Z'; i++) {
			for(char j=i; j<=ch; j++) {
				System.out.print(j);
				
			}
			ch--;
			System.out.println();
			}
		}

	

}
