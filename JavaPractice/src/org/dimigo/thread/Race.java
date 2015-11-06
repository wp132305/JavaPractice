package org.dimigo.thread;

public class Race {
	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Runner GilDong = new Runner ("홍길동");
		Runner GilSoon = new Runner ("홍길순");
		
		GilDong.setPriority(Thread.MAX_PRIORITY);
		GilSoon.setPriority(Thread.MAX_PRIORITY);
		
		GilDong.start();
		GilSoon.start();
		
		System.out.println("main thread end");
	}
}
