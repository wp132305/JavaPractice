package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;
		
		System.out.println("가장 좋아하는 가수는?");
		answer = scan.nextLine();
		if(answer.equals("초아"))
			System.out.println("정답입니다!! ^^");
		else
			System.out.println("틀렸습니다!! ㅠㅠ");
		
		System.out.println("\n가장 좋아하는 운동은?");
		answer = scan.nextLine();
		if(answer.equals("농구"))
			System.out.println("정답입니다!! ^^");
		else
			System.out.println("틀렸습니다!! ㅠㅠ");
		
		System.out.println("\n가장 좋아하는 포켓몬은?");
		answer = scan.nextLine();
		if(answer.equals("이상해씨"))
			System.out.println("정답입니다!! ^^");
		else
			System.out.println("틀렸습니다!! ㅠㅠ");
		
		scan.close();
	}
}
