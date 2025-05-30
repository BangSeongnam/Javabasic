package javaStudy.day8.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * ArrayList 는 배열로 요소(elements) 를 관리하는 객체임.
 * 가장많이 쓰임. Vector 의 후속 모델임
 */
public class AraayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("일");
		list.add("2");
		list.add("삼");
		
		//다형성을 이용, super 타입으로 ArrayList 만들어 보기
		List<String> list2 = new ArrayList<String>();
		list2.add("백");
		list2.add("이백");
		list2.add("삼백");
		
//		for(int i =0; i <list.size(); i++) {
//			System.out.println(list.get(i)); 
//			System.out.println(list.remove(i));
//			
//		}
//		System.out.println(list.size());
		
		//두개를 합쳐볼께요
		list.addAll(list2);
		System.out.println(list);
		
		list.removeAll(list2);
		System.out.println(list);
		
		System.out.println(list.contains("일"));
		
		//Board 객체를 이용, 간단한 게시판 만들어보기
		Board article1 = new Board("첫 글 제목","첫 글 내용","아무개1", 1);
		Board article2 = new Board("두번째 글 제목","두번째 글 내용","아무개2", 2);
		Board article3 = new Board("세번째 글 제목","세번째 글 내용","아무개3", 3);
		Board article4 = new Board("네번째 글 제목","네번째 글 내용","아무개4", 4);
		
		List<Board> boardList = new ArrayList<Board>();
		boardList.add(article3);
		boardList.add(article4);
		boardList.add(article1);
		boardList.add(article2);
		
		printBoard(boardList);
		
		
	}
	public static void printBoard(List<Board> lists) {
		for(Board board : lists) {
			System.out.println(board.getNum() + ":" + board.getWriter() + ":" +board.getSubject() + ":" + board.getContent());
		}
		System.out.println("원본 "+ lists);
		
		Collections.sort(lists);
		System.out.println(lists);
		
		//내림차순으로 정렬하기
		Collections.sort(lists, Collections.reverseOrder());
		System.out.println(lists);
		
	
	}

}
