package javaStudy.day4_interface;

public class UseRemocon {

	public static void main(String[] args) {
		/*
		 * 다형성을 이용해서 TV, Audio 리코컨 객체를 생성합니다.
		 */
		RemotControl tvRc= new TV();
		RemotControl audioRc= new Audio();
		RemotControl smartTv= new SmartTv();
		
		tvRc.turnOn();
		audioRc.turnOn();
		
		tvRc.volumeUp(5);
		audioRc.volumeDown(3);

		tvRc.setMute(true);
		System.out.println("티비의 최대 볼륨은 "+ RemotControl.MAX_VOLUME);
		
		
		RemotControl.chageBatter();
	
	}

}
