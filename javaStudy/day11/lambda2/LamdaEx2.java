package javaStudy.day11.lambda2;

import java.util.function.Function;

public class LamdaEx2 {

	public static void main(String[] args) {
		Function<String, Integer> f =(s) -> Integer.parseInt(s,16);
		Function<Integer, String> g = i -> Integer.toBinaryString(i); 
		
		Function<String, String> h = f.andThen(g);
		Function<Integer, Integer> h2 = f.compose(g);
		
		System.out.println(h.apply("F"));
		System.out.println(h2.apply(2));
	}

}
