package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		double tUpLength = 9, tDownLength = 10, tHeight = 5.8;
		double pLength = 9, pHeight = 5.4;
		
		double tArea = (tUpLength + tDownLength) * tHeight / 2;
		double pArea = pLength * pHeight;
		
		double difference = tArea - pArea;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + tArea);
		System.out.println("평행사변형 넓이 : " + pArea + "\n");
		
		if(difference > 0)
			System.out.println("사다리꼴이 평행사변형 보다 " + difference +" 더 큽니다.");
		else if(difference < 0)
			System.out.println("평행사변형이 사다리꼴 보다 " + -difference +" 더 큽니다.");
		else
			System.out.println("사다리꼴과 평행사변형의 넓이가 같습니다.");
	}
}
