package javaStudy.day5;

import java.lang.reflect.Array;

import javaStudy.day4_interface.Audio;
import javaStudy.day4_interface.RemotControl;
import javaStudy.day4_interface.TV;

public class InterFaceExam2 {
	
	  static void intergrityRemote(RemotControl rc[]) {
		
		for(int i = 0; i<rc.length; i++) {
			
			rc[i].turnOn();
			if (rc[i] instanceof SmartTv) {
				SmartTv smartTv=new SmartTv();
				smartTv.search("네이버");
		
			}
		}
		
	}

	public static void main(String[] args) {
		
		TV tv =new TV();
		Audio audio = new Audio();
		SmartTv smTv = new SmartTv();
		
		RemotControl[] constrols = {tv, audio, smTv};
		intergrityRemote(constrols);
		
		
//		DoService service = new DoServiceImpl();
//		
//		service.def1Method();
//		System.out.println();
//		service.def2Method();
//		
//		System.out.println();
//		DoService.staticMethod();
//		System.out.println();
//		DoService.staticMethod2();
//		
//		
//		
//		//스마트티비 리모컨 생성함.
//		RemotControl remocon = new SmartTv();
//		
//		remocon.turnOn();
//		remocon.turnOff();
//		
//		((Searchable)remocon).search("네이버");
		
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumeUp(int volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumeDown(int volume) {
		// TODO Auto-generated method stub
		
	}

}
