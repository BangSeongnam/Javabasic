package javaStudy.day10.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx2 {
	
	
	static<T> List<T> doSomething(Function<T, T> f, List<T> list){
		List<T> newList = new ArrayList<T>(list.size());
		
		for(T i : list) {
			newList.add(f.apply(i));
		}
		return newList;
	}

	static<T> void printEvenNum(Predicate<T> p, Consumer<T>c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i)) {
				c.accept(i);
			}
		
		}
		System.out.print("]");
	}
	
	
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0; i<10; i++) {
			
			list.add(s.get());
			
		}
	}
	public static void main(String[] args) {

		Supplier<Integer> s = () -> (int)(Math.random()*100)+1;
		Consumer<Integer> c =  t -> System.out.println(t + ", ");
		Predicate<Integer> p = t -> t%2 ==0; 
		Function<Integer, Integer> f = t -> t /10*10;
		
		List<Integer> list = new ArrayList<Integer>();
		makeRandomList(s, list);
		System.out.println(list);
		
		//printEvenNum(p, c, list);
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
		
	}

}
