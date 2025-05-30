package javaStudy.day9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * InputStream : 추상화된 클래스, 이 클래스의 read() 가 추상메서드이고, 모든 하위 클래스는 
 * 이메서드를 오버라이드 함.
 * 이 메서드는 스트림내부의 하나의 byte 를 read 한후 그 값을 int 로 리턴함
 * 
 * 위 클래스의 하위 클래스는 어디로 부터 스트림을 연결할것인지를 정의한 클래스임
 * source target 에 따른 알맞은 하위 클래스를 이용, 스트림을 연결하면, 내부적으로 
 * 바이트의 흐름이 생성되어, 스트림에 쌓여진다. 이름 read()로 읽어들이는 것임. 
 * 
 * OutputStream : 스트림을 통해 data 를 특정 대상 (파일, 네트웍등..)에다 쓰는 역할을 하는 root class
 * 만약 파일에 데이터를 쓰려면, FileOutputStream 을, 기타 다른곳에 쓰려면, 해당 스트림을 이용한다.
 * 여기서 곡 알아야 할 것은, 만약 FileOutputStream 을 이용해서 쓸경우, file 이 존재하지 않는 경우엔 무조건 새로 만들어 버린다.
 * 만약 존재한다면, 기존 내용을 지우고 다시 데이터를 쓰게 된다.. 꼭 기억...
 * 
 *
 *FileBackUp.java 를 생성한후, InputEx1.java 를 복사한 InputEx1_back.java 파일을 생성하라
 *조건으로는 100byte 배열을 생성해서 이걸 read/write 하는데 사용한다.
 *
 */
public class InputEx2 {

	public static void main(String[] args) {
		byte[] imgByte =new byte[1024];//1KB
		FileInputStream fis = null;
		String source = "C:\\Users\\TJ\\Desktop\\p_img\\KakaoTalk_20250526_181711177.png";
		String targetFolder = "D:\\User\\";
		int rData;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(source);
			bis = new BufferedInputStream(fis);
			//배열을 이용, 읽은 이미지 데이터를 콘솔에 출력하라.
			fos = new FileOutputStream(targetFolder+"kkomak.png");
			
			
			while((rData = bis.read(imgByte))!= -1) {
				
				fos.write(imgByte, 0, rData);
//				for(int i =0; i<rData; i++) {
//					System.out.println(imgByte[i]);
//					fos.write(imgByte[i]);
//				}
			}
			bis.close();
			fos.close();
			fis.close();
			System.out.println("파일 복사 완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
