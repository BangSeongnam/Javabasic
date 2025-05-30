package javaStudy.day12.net.multichat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

public class ChatServer {

	//필드 선언..
	ServerSocket serverSocket;
	//100개의 쓰래드를 생성해주는 쓰래드풀 객체 선언
	ExecutorService executorService = Executors.newFixedThreadPool(100);
	//연결된 클라이언트의 소켓과 ID 정보를 담당할 Map 객체 선언
	//이 맵에는 실제 여러분의 메세지기 담기고, 다시 여러분에게 전송되기 때문에
	//반드시 동기화 되어야함. 아니면, 메세지가 섞여서 전달될거임.
	//때문에 내부적으로 동기화 처리가 된 Map 객체를 얻어서 사용함..
	Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap());
	
	//start 정의
	public void start() throws Exception{
		serverSocket = new ServerSocket(8888);
		System.out.println("서버 스타트됨");
		
		Thread thread = new Thread(()->{
			try {
				while(true) {
					Socket socket = serverSocket.accept();
					SocketClient sc = new SocketClient(this, socket);
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		});
		thread.start();
	}
	
	//클라이언트 연결시 SocketClient 생성 및 추가 하는 메서드 정의
	public void addSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;//채팅 ID 및 메세지의 key 로 사용할 예정임
		chatRoom.put(key, socketClient);
		System.out.println("신규입자 : " + key);
		System.out.println("현재 채팅자 수 : " + chatRoom.size() + "\n");
		
	}
	
	//클라이언트 연결 종료시 채팅인원수에서 제거(즉 SocketClient 제거)
	public void removeSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.remove(key);
		System.out.println("나감... --> " + key);
		System.out.println("현재 채팅자 수 : " + chatRoom.size() + "\n");
	}
	
	//연결된 모드 클라이언트에게 메세지를 전송할 메서드 정의
	public void sendToAll(SocketClient sender, String message) {
		JSONObject root = new JSONObject();
		root.put("clientIp", sender.clientIp);
		root.put("chatName", sender.chatName);
		root.put("message", message);
		String json  = root.toString();
		
		//채팅룸의 value get..
		Collection<SocketClient> socketClients = chatRoom.values();
		
		for(SocketClient sc : socketClients) {
			if(sc == sender)continue;//메세지 작성자는 제외
			sc.send(json);
		}
	}
	
	public void stop() {
		try {
			serverSocket.close();
			executorService.shutdown();
			chatRoom.values().stream().forEach(socketClient -> socketClient.close());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			ChatServer chatServer = new ChatServer();
			chatServer.start();
			
			System.out.println("서버 종료시 q 입력");
			
			Scanner sc = new Scanner(System.in);
			while(true) {
				String key = sc.nextLine();
				if(key.equalsIgnoreCase("q"))
					break;
			}
			sc.close();
			chatServer.stop();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
