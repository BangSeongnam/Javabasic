package javaStudy.day11.thread;

import java.util.Scanner;

/*
 * 쓰레드를 생성하는 방법은 두가지가 있음.
 * 
 * 1. 쓰레드 클래스를 상속하는 방법. 상속한 클래스는 그 자체가 쓰래드임
 * 2. Runnable 인터페이스를 구현하고, Thread 객체에 탑재되는 방법
 * 
 * 
 */
class MyThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i =0; i<1000; i++) {
			System.out.println("+");
		}
		System.out.print(Thread.currentThread().getName()+ " 2종료~");
	}
}
class YourThread implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i =0; i<1000; i++) {
			
			System.out.println("!");
		}
		System.out.print(Thread.currentThread().getName()+ " 3종료~");
	}
	
}
public class ThreadEx2 {


	public static void main(String[] args){
		
		MyThread thread = new MyThread();
		thread.start();
		
		
		
		Thread runnableThread = new Thread(new YourThread());
		runnableThread.start();
		Thread thread4 = new Thread(() ->{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i =0; i<1000; i++) {
				System.out.println("^");
			}
			System.out.print(Thread.currentThread().getName()+ " 4종료~");
		} );
		
		thread4.start();
		for(int i =0; i<1000; i++) {
			System.out.println("*");
		}
		System.out.print(Thread.currentThread().getName()+ " 1종료~");
	}

}
