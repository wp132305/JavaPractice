package org.dimigo.oop;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.setCompany("현대자동차");
		c1.setModel("제네시스");
		c1.setColor("검정색");
		c1.setMaxSpeed(225);
		c1.setPrice(50000000);
		
		c2.setCompany("기아자동차");
		c2.setModel("K7");
		c2.setColor("흰색");
		c2.setMaxSpeed(245);
		c2.setPrice(40000000);
		
		c3.setCompany("삼성자동차");
		c3.setModel("SM7");
		c3.setColor("회색");
		c3.setMaxSpeed(200);
		c3.setPrice(38000000);
		
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
