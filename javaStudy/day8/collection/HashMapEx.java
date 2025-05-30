package javaStudy.day8.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * key, value 로 객체를 관리하는 Map interface
 * 대표적인 구현체로는 HashMap 이 있다.
 * Map 은 키중복을 불허 하고, 값 중복은 허용한다.
 */
public class HashMapEx {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "일");
		map.put(2, "이");
		map.put(3, "삼");
		
		//get 해보기..
		//Map 또한 hash 코드를 기반으로 객체 관리를 하기 때문에 index 가 없음.
		//때문에 전체 순회를 할수 없음.. 다입 변환을 해야만 가능함.
		
		
		System.out.println(map.get(1));
		System.out.println(map.get(3));
		
		Set<Map.Entry<Integer, String>> entry = map.entrySet();
		System.out.println(entry);
		Iterator it =entry.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
