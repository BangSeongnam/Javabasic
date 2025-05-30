package javaStudy.day8.collection;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;


/*
 * FIFO(First in First out) : 선입선출의 자료구조를 나타냄. 대표적인 규조가 Queue 임
 * LIFO(Last in First Out) : 후입선출의 자료구조를 나타냄. 대표적인 구조가 Stack임.
 * LinkedList 는 index 가 없기 때문에 index 로 순회(Iterating) 할 수가 없는 구조임.
 * 그래서 여러 상속 관계에서 제공해주는 메서드를 이용해서 순회 할 수 있도록 해야함.
 * 대표적인 메서드가 isEmpty() 임. 자료 구조의 element 의 존재 여부를 t/false 로 리턴함.
 */
public class LinkedListEx {
	public static void main(String[] args) throws IOException, URISyntaxException {
//		Queue<Integer> q = new LinkedList<Integer>();
//		
//		q.offer(5);
//		q.offer(4);
//		q.offer(3);
//		q.offer(2);
//		q.offer(1);
//		
//		while(!q.isEmpty()) {
//			//head 에 있는 요소를 지우지 않고 리턴시킴.
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(q.poll());
//		}
		
		String url = "https://www.naver.com";
		
		Desktop.getDesktop().browse(new URI(url));
		Desktop.getDesktop().browse(new URI("https://www.naver.com"));
		
		Stack<String> stack = new Stack<String>();
		stack.push("hi");
		stack.push("there");
		stack.push("there");
	
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());//맨 윗넘을 리턴시키고 지운다
		}
		
		//모든 Collection 하위 타입들은, 기본적으로 Iterator 의 하위 타입이다.
		//이넘은 순서없이(index 없이), 요소를 순회할수 있는 기능을 가진 interface 인데,
		//이넘을 구현한 애들은 이 타입으로 변경 가능하다.
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("dd");
		ll.add("KK");
		ll.add("GG");
		
		for(int i = 0; i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
