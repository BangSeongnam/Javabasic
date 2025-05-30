package javaStudy.day4_interface;
/*
 * interface 는 자바에서 기능을 목적으로 다중 상속을 하는데 사용됨
 * interface 는 class 가 아니기 때문에, 생성자를 가질수 없고, 때문에
 * 자신의 instance 를 생성할 수 없음 
 * 그리고 인터페이스는 기본적으로 메서드를 선언하게 되면 무조건 public abstract
 * 가 컴파일시에 추가됨
 * 
 * 이런 특징들과 또한, 인터페이스 간에는 다중 상속이 가능함
 * ex> Interface a extends B,C,D....
 * 
 * JDK 17 이전버전에서는 인터페이스에서는 상수와 추상 메서드 선언만 가능했지만 
 * 업버전된 이후에는 다음과 같은 것들이 추가됨
 * 
 * 1. public 상수필드, 추상 메서드 --> 기존내용
 * 2. public default 메서드 
 * 3. public 정적(static) 메서드
 * 4. private 메서드
 * 5. private 정적 메서드 
 * 
 * 위 내용은 순차적으로 풀어갈 예정임
 */
public interface RemotControl {
	//필드는 기본적으로 public static final 키워드가 붙음
	//리모컨에서 사용될 볼륨 필드 선언함.
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	
	
	void turnOn();
	void turnOff();
	void volumeUp(int volume);
	void volumeDown(int volume);
	
	/*
	 * 정적메서드 : 이 메서드는 구현객체가 필요없는 메서드입니다. 즉 구현하는 클래스가 아니더라도 이 메서드를 호출할 수 있다는 뜻
	 * ex> Interface.staticMethod();
	 * 
	 * 문법은 다음과 같음 : public || private static returnType methodName(p1,p2...);
	 * 
	 * 내부의 static 만 호출 가능함.
	 */
	//리모컨에 밧데리를 교환 하도록 정의 합니다.
	//이 밧데리는 리모콘에 국한된 기능이기 때문에 자신이 이 기능을 정의 합니다.
	public static void chageBatter() {
		
		
		System.out.println("리모컨 밧데리를 교체함.");}
		
	/*
	 * JDK 17? 부터 지원되는 default 메서드
	 * 이 메서드는 인터페이스가 메서드의 정의부를 갖도록하는 문법이다.
	 * 이걸 사용하는 주된 목적은, 내부 메서드나, 필드를 이용해서 내용부에서 하용하기 위함이며,
	 * 특히, 이 메서드는 기본적으로 하위 클래스에 상속되어지기 때문에, sub class 에서 특정 
	 * 목적으로 활용되길 목적으로 정의 하는 경우도 많다(나중에 스프링부트 시간에 많이 보게됨)
	 * 꼭 기억 해야함.
	 * 문법은 리턴타입 앞에 default 키워드를 넣기만 하면됨.
	 * 
	 * 꼭 기억.. default 메서드 또한 자식이 필요에 따라서 override 가능함. 
	 * 이때 주의해얄점은 반드시 public 이어야 하고 (다른거 안됨)
	 * default 키워드를 생략해야 합니다.  
	 *
	 */
	default void setMute(boolean mute) {
		//사용자가 mute 키를 눌렀는지 확인 
		if(mute) {
			System.out.println("무음 처리함");
			volumeDown(MIN_VOLUME);
		}else {
			System.out.println("무음처리를 해제함.");
		}
	
	
	}
	/*
	 * private 메서드 : 이 메서드는 인터페이스 내부에서만 활용 하도록 정의된 내용을 갖도록 하는 목적이다.
	 * 이 메서드는 일반 멤버 메서드가 필요시에 호출 할 수 있도록 설계되어짐.
	 * 이 말은 곧 default 메서드에서 호출 가능하도록 설계한 것임.. 코드를 재 활용할 수 있기 때문에 코드 중복을 줄일수 있음.
	 * 
	 * private static 메서드: static 메서드에 호출 하도록 설계됨, 또한 default 메서드에서 호출이 가능함.
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
