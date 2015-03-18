package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monthlySalaly = 1700000;
		int employee = 3;
		int shop = 1500;
		long annualSalaly = (long)monthlySalaly * 12 * employee * shop;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", monthlySalaly) + "원");
		System.out.println("점포 내 직원 수 : " + employee + "명");
		System.out.println("점포 수 : " + String.format("%,d", shop) + "개");
		
		System.out.println("\n\n연간 인건비 : " + String.format("%,d", annualSalaly) + "원");

	}

}
