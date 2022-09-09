package week3.day1java;

public class Calculator {
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
		
	}
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	public void add(double x,double y) {
		System.out.println(x+y);
	}
	public void add(double z,int j) {
		System.out.println(z+j);
	}

public static void main(String[] args) {
	Calculator cal =new Calculator();
	cal.add(5.1, 2.20);
	cal.add(5.2, 10);
	cal.add(5,4);
	cal.add(4,3, 2);
	
}}