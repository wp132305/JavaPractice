package org.dimigo.thread;

public class Race2 {
	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Thread GilDong = new Thread(new Runner2 ("홍길동"));
		Thread GilSoon = new Thread(new Runner2 ("홍길순"));
		
		GilDong.setPriority(Thread.MAX_PRIORITY);
		GilSoon.setPriority(Thread.MIN_PRIORITY);
		
		GilDong.start();
		GilSoon.start();
		
		System.out.println("main thread end");
	}
}
