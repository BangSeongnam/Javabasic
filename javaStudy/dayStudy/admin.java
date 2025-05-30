package javaStudy.dayStudy;

public class admin extends user{
	
	private int workerPhonenumber;
	
	
	
//	public admin(String id, String password) {
//		super(id, password);
//	}
//	
	public admin(String id, String password, int workerNumber) {
		super(id, password);
		this.workerPhonenumber = workerNumber;
	}
	
	public void deleteUser(user User) {
		User.setId(null);
		User.setPassword(null);
		User.setNickName(null);
	}
	
	
	public String toString() {
		return super.toString()+ "Admin_" + workerPhonenumber;
	}
	
	


}
