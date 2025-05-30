package javaStudy.day7;

import javax.swing.JOptionPane;

/*
 * 이 예시는 다중으로 예외 핸들링을 통한 예외 제어를 보여줍니다.
 */
public class ExeptionEx4 {
	public static void main(String[] args) {
		String msg = "가위(1) 바위(2) 보(3) 아무거나 입력하세요";
		String input = JOptionPane.showInputDialog(msg);
		String inStr;
		int inValue;
		try {
			inValue = Integer.parseInt(input);
			try {
				inStr = input;
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {

		}
	}

}
