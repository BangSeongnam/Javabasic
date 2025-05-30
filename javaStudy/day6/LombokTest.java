package javaStudy.day6;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
//@NoArgsConstructor
//@AllArgsConstructor
@Data
public class LombokTest {
	
	private String name;
	private String id;
	private int age;
	private boolean fromSns;
		
	
}
