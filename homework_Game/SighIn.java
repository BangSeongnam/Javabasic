package homework_Game;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SighIn {
	
	public static final String DATA_BASE_FOLDER_ROOT = "D:\\backend_workspace_Real\\javaStudy\\src\\homework_Game";
	
	Scanner sc = new Scanner(System.in);
	
	String inputId;
	int inputPw;
	
	String sighInId;
	int sighInPw;
	

	String checkPt = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	String PwCheck = "^[0-9]*$";
	
	public  void SignUp() {

		while(true)
		{
			String valId = inputId();

			boolean isMatch = validateId(valId);
			if(isMatch) 
			{
				break;
			}
			
			System.out.println("이메일 틀림 ㅋㅋ 다시 하셈");
		}
	
		System.out.println("사용하실 Pw를 입력하세요");
		inputPw = sc.nextInt();
		
		
		boolean isWrite = writeUserFile();
		
		System.out.println(isWrite ? "정상 가입이 완료되었습니다. 메인으로 돌아갑니다."
									: "파일 저장에 실패하였습니다. 회원 가입에 실패하였습니다.");
	}
	
	private String inputId()
	{
		System.out.println("사용하실 Email ID 를 입력하세요");
		inputId = sc.nextLine();
		return inputId;
	}

	private boolean validateId(String inputID)
	{
		Pattern p = Pattern.compile(checkPt);
		Matcher m = p.matcher(inputID);
		return m.matches();
	}
	
	private boolean writeUserFile()
	{
		try {
			File file = new File(DATA_BASE_FOLDER_ROOT + inputId +".txt");

			file.createNewFile();

			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(inputId);
			bw.write(inputPw);
			
			bw.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
