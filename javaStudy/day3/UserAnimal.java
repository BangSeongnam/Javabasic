package javaStudy.day3;

//정의된 Animal 클래스를 객체화 해서 사용하는 클래스 입니다.

public class UserAnimal {	
	public static void main(String[] args) {
		
//		Animal animal = new Animal("애니멀");
		
//		Dog dog = new Dog("두아","토이푸들");
//		Cat cat = new Cat("루비","페르시안친칠라");
//		Duck duck = new Duck("도날드덕","헐리웃오리");
		
		/*
		 * 다형성(Polymorphism) :상속관계에서 인스턴스를 생성할때 ref 타입이 변경되는 것을 말함.
		 * 여기서 중요한건, 부모타입으로 자식 인스턴스를 생성해도,  인스턴스는 무조건 호출된 생성자의 instance 라는 것임
		 * 이 instance 는 절대 불변임.. 하지만 얘를 ref 하는 변수 타입은 super or 하위 타입으로 가능함
		 * 이때 만약 타입이 상위에서 하위 타입으로 변경시엔 반드시 type casting 연산을 통해 이뤄져야함.
		 */
		
		Animal dog = new Dog("두아","토이푸들");
		Animal cat = new Cat("루비","페르시안친칠라");
		Animal  duck= new Duck("도날드덕","헐리웃오리");
		
		System.out.println(dog.toString());
//		
//		System.out.println(dog);
//		System.out.println(cat);
//		System.out.println(duck);
//		
//		dog.sound();
//		cat.sound();
//		duck.sound();
//		
		//Animal 타입의 객체 3개를 배열에 담습니다. 
		Animal[] animals = {new Dog("두아","토이푸들"), new Cat("루비","페르시안친칠라"), new Duck("도날드덕","헐리웃오리") };
		for(int i=0; i<animals.length; i++) {
			Animal thePet =animals[(int)(Math.random()*animals.length)];
			System.out.println(thePet);
			thePet.sound();
			
			//instanceof(className) 이 메서드는 해당 instance 가 클래스타입의 인스턴스라면 true 아니면 false 리턴함.
			if (thePet instanceof Duck) {
			((Duck)thePet).layEggs();
			}
		}
		
		
	}
}
