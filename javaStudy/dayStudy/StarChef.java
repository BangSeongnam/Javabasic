package javaStudy.dayStudy;

public class StarChef extends Chef{
	
	String[] broadCast = {"SBS","KBS","MBC"};
	
	public StarChef(String name, String type, String[] broadCast) {
		super(name, type);
		this.broadCast=broadCast;
	}
	
	public void showBroadcast(String[] broadCast) {
		for(int i = 0; i<broadCast.length; i++) {
			if(broadCast[i].equals("SBS")) {
				System.out.println("손민우!");
			}else if(broadCast[i].equals("KBS")) {
				System.out.println("최재형!");
			}else {
				System.out.println("주덕호!");
			}
		}
	}

}
