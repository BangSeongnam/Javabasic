package javaStudy.day4;

public class UseCarExam {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		Car jaehyungCar = new Car();
		
		Tyre myCarTyre = new KumhoTyre();
		Tyre jaehyungCarTyre = new HankookTyre();
		
//		myCar.tyre = new KumhoTyre();
//		jaehyungCar.tyre = new HankookTyre();
//		
		myCar.tyre = myCarTyre;
		jaehyungCar.tyre =jaehyungCarTyre;
		
		myCar.running();
		jaehyungCar.running();
	}

}
