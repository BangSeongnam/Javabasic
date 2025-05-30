package javaStudy.day8;

import java.util.List;

class TheBox{//박스내부의 필드는 객체를 나타냄
	// 이 박스에는 여러가지가 들어갈텐데(다른 타입들)....
	//때문에 최상위 타입인 Object 로 변수를 선언함.
	public Object obj;
	public Object count;
}

//제네릭표식은 클래스명 끝에 해줍니다.
//타입은 VM 동적으로 매핑해주기 때문에 실제 타입명이 아니라, 키워드를 사용합니다.
//A~Z 까지 어떤 문자를 사용해도 좋지만, 직관적인 키워드로 Type 은 T 로 사용하면 좋습니다.
//그럼 이 T 가 내부의 필드에 타입으로 자동 지정됩니다. 
class TheGenericBox<T>{
	public T theItem;
	
	public T get() {
		return theItem;
	}
	
	public void set(T theItem) {
		this.theItem = theItem;
	}

	public T getTheItem() {
		return theItem;
	}

	public void setTheItem(T theItem) {
		this.theItem = theItem;
	}
	
}

public class GenericEx1 {

	public static void main(String[] args) {
		TheBox box = new TheBox();
		box.obj ="이건 신발";
		box.count =Integer.valueOf(2);//Integer
		
		String theItem =(String)box.obj;
		TheGenericBox<String> tgBox = new TheGenericBox<String>();
		tgBox.theItem = "명품옷";
		String cloth = tgBox.theItem;
		
		List<String> list = null;
	}

}
