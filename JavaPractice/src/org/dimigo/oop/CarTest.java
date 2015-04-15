package org.dimigo.oop;

public class CarTest {

	public static void main(String[] args) {
		
		Car2 c1 = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car2 c2 = new Car2("기아자동차", "K7", "흰색", 245, 40000000);
		Car2 c3 = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		
		String company = c1.getCompany();
		String model = c1.getModel();
		String color = c1.getColor();
		int maxSpeed = c1.getMaxSpeed();
		int price = c1.getPrice();
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : " + company);
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("최대속도 : " + maxSpeed + "km");
		System.out.println("가격 : " + String.format("%,d", price) + "원");
		
		company = c2.getCompany();
		model = c2.getModel();
		color = c2.getColor();
		maxSpeed = c2.getMaxSpeed();
		price = c2.getPrice();
		
		System.out.println("\n제조사명 : " + company);
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("최대속도 : " + maxSpeed + "km");
		System.out.println("가격 : " + String.format("%,d", price) + "원");
		
		company = c3.getCompany();
		model = c3.getModel();
		color = c3.getColor();
		maxSpeed = c3.getMaxSpeed();
		price = c3.getPrice();
		
		System.out.println("\n제조사명 : " + company);
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("최대속도 : " + maxSpeed + "km");
		System.out.println("가격 : " + String.format("%,d", price) + "원");
	}

}
