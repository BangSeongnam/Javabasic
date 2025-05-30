package homework_Game;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager {
	Scanner sc = new Scanner(System.in);
	String Id;
	int Pw;

	

	

	public void Login() {
		System.out.println("Id를 입력하세요.");
		Id = sc.nextLine();
		System.out.println("Pw를 입력하세요.");
		Pw = sc.nextInt();
	}
	
	public void gameStart() {
		Game game = new Game();
		game.startGame();
	}
	
	public void checkInfo() {
		if(Id.equals(Id) == )
	}

	public void getUserInfo() {
		
	}

}
