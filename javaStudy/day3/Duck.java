package javaStudy.day3;

public class Duck extends Animal{
	
	private String name;
	private String breed;
	
//	public Duck() {
//		super("오리");
//	}
	protected Duck(String name){
		super("오리");
		this.name = name;
	}
	
	public Duck(String name, String breed) {
		super("오리");
		this.name = name;
		this.breed = breed;
	}
	
	@Override//어노테이션.. 컴파일시에 이 메서드를 오버라이드 했는지를 검증하라는 의미임.. 자세한건 나중에 배움.
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " 이름은 " + name + " 품종은 " + breed;
	}
	@Override
	public void sound() {
		System.out.println("꽥꽥");
	}
	
	//알 낳는 기능을 정의함
	public void layEggs() {
		System.out.println("숨풍숨풍");
	}
}
