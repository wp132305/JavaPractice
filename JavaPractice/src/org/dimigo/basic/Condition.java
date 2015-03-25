package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		
		int distance = 10;
		String model = "고속버스";
		
		int toll = 0;
		int extra = 200;
		
		switch(model)
		{
		case "고속버스":
			toll += 850;
			extra = 300;
			break;
		case "경차":
			toll += 300;
			break;
		default:
			toll += 600;
		}
		
		toll += distance / 10 * extra;
		if(distance%10==0) toll-=extra;
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + model);
		System.out.println("통행료 : " + toll + "원");
	}

}
