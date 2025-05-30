package javaStudy.day11.lambda2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * 컬렉션을 스트림으로 변경하면, 스트림에서 제공하는 다양한 연산 메서드를 활용할수 있다.
 * 대표적인게 중간집계 및 최종 처리 함수등이다.
 * 주의! 만약 중간집계 함수를 사용하는 경우엔 반드시 최종 처리 함수를 사용해야만 한다.
 * 안그럴 경우 중간집계 함수가 제대로 처리되지 않는다.
 * 
 */
@Data
//@Builder
@AllArgsConstructor
class Student {
	private int score;
	private String name;
	private int jo;

}

public class UseStreamEx1 {

	public static void main(String[] args) throws Exception{
		List<Student> list = Arrays.asList(new Student(85, "AA", 3), new Student(60, "BB", 2),
				new Student(100, "CC", 1));

		double avg = list.stream().mapToInt(student -> student.getScore()).average().getAsDouble();

		System.out.println(avg);

		list.stream().forEach(s -> System.out.println(s));

		Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).forEach(v -> System.out.println(v));

		IntStream.range(1, 101).forEach(v -> System.out.println(v));

		// Stream<Student> stream = list.stream();
//		
//		IntStream intStream =stream.mapToInt(student -> student.getScore());
//		OptionalDouble optionalDuble = intStream.average();
//		double avg = optionalDuble.getAsDouble();
//		
//		System.out.println("니얼평 : " + avg);
		//파일로부터 스트림을 얻어내서 출력해보기
		Path path =Paths.get(UseStreamEx1.class.getResource("mydata.data").toURI());
		Stream<String> stream = Files.lines(path);
		stream.forEach(t -> System.out.println(t) );
		stream.close();

	}

}
