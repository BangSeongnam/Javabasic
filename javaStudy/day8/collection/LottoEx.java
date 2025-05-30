package javaStudy.day8.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LottoEx {
	public static void main(String[] args) {
		Set<Integer> LottoNum = new HashSet<Integer>();
		
		
		
		while(LottoNum.size()<6) {
			LottoNum.add((int)(Math.random()*45)+1);
		}
			
		
		
		System.out.println("이번주 당첨 번호는 : " + LottoNum);
		
		//위 set 을 ArrayList 로 담은후, 오름차순으로 정렬해보삼
		
		ArrayList<Integer> LottoNumList = new ArrayList<Integer>(LottoNum);
		Collections.sort(LottoNumList);
		System.out.println(LottoNumList);
		
	}
}
