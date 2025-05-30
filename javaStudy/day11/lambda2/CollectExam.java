package javaStudy.day11.lambda2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * collect() : 이 메서드를 이용하면 스트림에서 처리된 처리 요소를 담은 새로운 collection
 * 으로 되돌리도록 정의된 메서드임.
 */
@Data
@AllArgsConstructor
class BoardDTO{
	private String id;
	private String subject;
	private String content;
}

public class CollectExam {

	public static void main(String[] args) {
		List<BoardDTO> dtos = new ArrayList<BoardDTO>();
		
		dtos.add(new BoardDTO("승민", "자바 언제끝나나요?", "30일날 끝나요???"));
		dtos.add(new BoardDTO("jason", "네. 맞습니다.", "30날 끝날거에요"));
		dtos.add(new BoardDTO("정현", "자바 다시 해주면 안돼요?", "너무 어려워요 ...."));
		dtos.add(new BoardDTO("정현1", "집에 가고 싶어요??", "집이 좋아서요"));
		
		List<BoardDTO> collectionList =dtos.stream()
		.filter(dto -> dto.getId().equals("정현"))
		.collect(Collectors.toList());
		
		collectionList.stream()
		.forEach(t -> System.out.println(t));
		
		System.out.println();
		Map<String, String> maps = dtos.stream()
		.filter(t -> t.getId().equals("정현"))
		.collect(Collectors.toMap(dto -> dto.getId(),dto -> dto.getSubject()));
	}

}
