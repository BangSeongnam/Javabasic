package javaStudy.day9;

import java.io.FileInputStream;
import java.util.Arrays;

/*
 * InputStream : 추상화된 클래스, 이 클래스의 read() 가 추상메서드이고, 모든 하위 클래스는 
 * 이메서드를 오버라이드 함.
 * 이 메서드는 스트림내부의 하나의 byte 를 read 한후 그 값을 int 로 리턴함
 * 
 * 위 클래스의 하위 클래스는 어디로 부터 스트림을 연결할것인지를 정의한 클래스임
 * source target 에 따른 알맞은 하위 클래스를 이용, 스트림을 연결하면, 내부적으로 
 * 바이트의 흐름이 생성되어, 스트림에 쌓여진다. 이름 read()로 읽어들이는 것임. 
 *
 */
public class InputEx1 {

	public static void main(String[] args) {
		// File 로 부터 스트림을 생성하도록 FileInputStream 객체 생성
		/*
		 * 이건 꼭 기억: 스트림이 연결된 모든 API 는 아래와 같은 순서를 가져야함. 스티림 연결 (객체생성) --> 읽거나 쓴다(read or
		 * write)-->반드시 닫는다(close)
		 */
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("mydata.data");
			// 스트림에 있는 첫번째 바이트를 읽음
			System.out.println(fis.available());

			// read(byte[]) : 이넘은 한번에 byte[] 크기 만큼 읽고, 새롭게 읽은 byte 의 수 (count) 를 리턴한다
			// 만약 파일에 끝에 다다른 경우, 더이상 읽을게 없기 대문에 역시 -1 을 리턴시킨다.
			
			byte readByte[]=new byte[3];
			int readCnt = fis.read(readByte, 0, 2); //2개만큼 읽고 0번 인덱스부터 저장하라. 실제 읽은 갯수 리턴 
			System.out.println(readCnt);
			System.out.println(Arrays.toString(readByte));
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			byte[] readByte = new byte[3];
//			int cnt;
//			while((cnt =fis.read(readByte))!=-1) {
//				for(int i = 0; i < cnt; i++) {
//					System.out.print((char)readByte[i]);
//				}
//				
//				
//			}

			// 스트림의 첫 3바이트만 읽어서 출력해보기
//			int readCount = fis.read(readByte);

//			System.out.println("읽은 바이트 수 : " + readCount);
//			System.out.println(Arrays.toString(readByte));
//
//			readCount = fis.read(readByte);
//
//			System.out.println("읽은 바이트 수 : " + readCount);
//			System.out.println(Arrays.toString(readByte));
//			
//			readCount = fis.read(readByte);
//
//			System.out.println("읽은 바이트 수 : " + readCount);
//			System.out.println(Arrays.toString(readByte));
//			
//			readCount = fis.read(readByte);
//
//			System.out.println("읽은 바이트 수 : " + readCount);
//			System.out.println(Arrays.toString(readByte));
//			
//			readCount = fis.read(readByte);
//
//			System.out.println("읽은 바이트 수 : " + readCount);
//			System.out.println(Arrays.toString(readByte));

//			int data = -1;
//			while ((data = fis.read())!= -1) {		
//				System.out.println(data);
//			}
			System.out.println();
			System.out.println(fis.available());
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
