package javaStudy.day10.io;

import java.io.File;

/*
 * File 객체. File 및 Folder 의 정보를 관리하는 객체
 * 많은 메서드가 존재하는데, 이를 이용해서 파일의 정보를 관리할수 있다. 
 * 폴더건 파일이건, 모두 File 객체로 생성하고, 메서드를 이용해서 폴더, 파일 여부를 확인할수 있다.
 */
public class FileExam {
	public static void main(String[] args) throws Exception{
		File parent = new File("D:\\rootFolder");
		File subsFolders = new File(parent, "sub" + File.separator + "f1");
		
		String thePath =subsFolders.getAbsolutePath();
		File file = new File(thePath, "jason.json");
		//폴더 또는 파일을 생성만 할수 있다. read/write 는 반드시 스트림을 통해야만 함.
		if(!parent.exists()) {
			parent.mkdir();
		}else {
			System.out.println(subsFolders.mkdirs());
		}
		file.createNewFile();
		
		System.out.println(file.getName());
		
		int pos = file.getName().lastIndexOf(".");
		String fileName = file.getName().substring(0,pos);
		String surfix = file.getName().substring(pos +1);
		
		System.out.println(file.length());
		//System.out.println(file.delete());
		
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		
		//같은 경로에 어떤 애들이 있는지 리턴받습니다.
		File[] files =parent.listFiles();
		for(File f : files) {
			System.out.println(f.isDirectory()? "폴더임":"파일임");
			System.out.println(f.isFile());
			System.out.println(f.delete());
		}
		System.out.println(file.lastModified());
		
		
		
		
		
	}
}
