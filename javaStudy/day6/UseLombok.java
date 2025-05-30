package javaStudy.day6;

import java.io.IOException;

public class UseLombok {

	public static void main(String[] args) throws IOException {
		
//		LombokTest lombokTest = new LombokTest();
//		lombokTest.setAge(0);
		
		LombokTest lom = LombokTest.builder().age(1).fromSns(false).id("brandon").name("성남").build();
		
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http://www.comic.naver.com");
		
		runtime.exec(new String[] {"notepad.exe"});
	}

}
