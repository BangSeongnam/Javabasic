package javaStudy.day4;

public class Car {
	//타이어가 필요하기 때문에 필드로 선언합니다.
	public Tyre tyre;
	
	public void running() {
		tyre.tireRoll();
	}

}
