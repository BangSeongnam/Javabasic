package javaStudy.day11.lambda2;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * T -> R 로 되돌려 주는 기능의 mapTo....();;
 * 
 */
@AllArgsConstructor
@Data
class Product {
	private int price;
	private String name;
}

public class MapToFuncEx {
	public static void main(String[] args) {
	List<Product> list = Arrays.asList(new Product(1000, "삼성TV"), new Product(20000, "LG 에어컨"));
	
//	list.stream()
//	.map(t -> t.getName())
//	.forEach(t -> System.out.println(t));
//	
	list.stream()
	.mapToDouble(t -> t.getPrice())
	.max()
	.ifPresent(value -> System.out.println(value));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
