package javaStudy.day8;

public class HomeSubsPR implements Subscribe<Home> {
	
	@Override
	public Home rent() {
		// TODO Auto-generated method stub
		return new Home();
	}

}
