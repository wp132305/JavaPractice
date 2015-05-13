package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.print("국어 점수 입력 => ");
		int kor = scan.nextInt();
		System.out.print("수학 점수 입력 => ");
		int math = scan.nextInt();
		System.out.print("영어 점수 입력 => ");
		int eng = scan.nextInt();
		
		sb.append("<< 점수 출력 >>\n");
		sb.append("국어 점수 : " + kor + " 점");
		sb.append("\n수학 점수 : " + math + " 점");
		sb.append("\n영어 점수 : " + eng + " 점");
		sb.append("\n총점 : " + (kor+math+eng) + " 점");
		sb.append("\n평균 : " + String.format("%.1f",((kor+math+eng)/3.0f)) + " 점");
		
		System.out.println(sb);
		scan.close();
	}

}
