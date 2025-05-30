package javaStudy.day10.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class BufferdReaderEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String logFile = "D:\\spread\\mylog.log";
		
		File f = new File(logFile);
		
		FileReader fr = null;
		BufferedReader br = null;
		LineNumberReader lnr = null;
		
		File dest = new File("junghyn.txt");
		FileWriter fw = new FileWriter(dest);
		PrintWriter pw = new PrintWriter(fw);
		
		if(f.exists()) {
			//br = new BufferedReader(new FileReader(new File("D:\\spread\\mylog.log")));
			
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			lnr = new LineNumberReader(br);
			String lines = null;
			
			while((lines = lnr.readLine()) !=null){
//				System.out.println(lnr.getLineNumber() + ". "+lines);
				pw.println(lnr.getLineNumber() + ". " + lines);
				pw.flush();
				
			}
			br.close();
			pw.close();
		}else {
			System.out.println("파일을 다시 확인해보세요");
		}
	}

}
