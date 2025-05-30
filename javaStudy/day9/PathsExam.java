package javaStudy.day9;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import javaStudy.day10.io.BufferdReaderEx;

/*
 * 특정 파일의 path 및 정보를 관리하는 paths
 * 이 객체의 get()을 이용 파일의 path 객체를 리턴시킨후, path 객체의 메서드를 
 * 이용해서 원하는 정보를 get 할수 있다. 
 * 
 * 기존에는 File 을 이용해서 했지만, 요즘은 점점더 paths, path 도 많이 이용한다.
 */
public class PathsExam {
	public static void main(String[] args) {
		//Path 는 Interface 이므로 반드시 Paths 를 통해서 객체를 get 한다. 
		Path path = Paths.get("D:\\backend_workspace_Real\\javaStudy\\src\\javaStudy\\day10\\io\\BufferdReaderEx.java");
		System.out.println(path.getFileName());
		System.out.println(path.getParent().getNameCount());
		System.out.println("중첩 경로수 : " + path.getNameCount());
		
		System.out.println();
		for(int i = 0; i<path.getNameCount(); i++) {
			System.out.println(path.getName(i));
		}
		
		System.out.println();
		Iterator<Path> it = path.iterator();
		while(it.hasNext()) {
			Path thePa = it.next();
			System.out.println(thePa.getFileName());
		}
		System.out.println(path.getRoot());
		}
}
