package javaStudy.day10.annotation;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Retention : 어노테이션이 유지되는 범위를 지정함
 * Source : 컴파일시 적용.. 컴파일후 어노테이션 제거됨.
 * CLASS : 메모리에 로딩될 때 적용됨..로딩후 어노테이션 제거됨
 * RUNTIME : 실행시에 적용됨... 계속 유지됨
 */
@Data
@NoArgsConstructor
public class Member {
	
	private String id;
	private String name;
	private int age;
	
	
}
