package javaStudy.day4_interface;

public class TV implements RemotControl{
	
	@Override
	public void turnOn() {
	System.out.println("TV를 켬");	
	}
	
	public static void main(String[] args) {
		TV tvRemocon = new TV();
		tvRemocon.turnOn();
		
		
		RemotControl rc = tvRemocon;
		rc.turnOn();
		
	}
	private int volume;
	@Override
	public void turnOff() {
		System.out.println("TV 끔");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumeUp(int volume) {
		if (volume > RemotControl.MAX_VOLUME) {
			this.volume = RemotControl.MAX_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Volume : " + this.volume);

	}

	@Override
	public void volumeDown(int volume) {
		if (volume > RemotControl.MIN_VOLUME) {
			this.volume = RemotControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("볼륨을 낮춤");
		// TODO Auto-generated method stub

	}
}
