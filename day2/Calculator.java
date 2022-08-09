package week1.day2;

public class Calculator {
	public int add(int n1,int n2) {
		return (n1+n2);
	}

	public float sub(float n3,int n4) {
		return (n3-n4);
		
	}
	public float mul(float n5,float n6) {
		return (n5*n6);
	}
	public float div(float n7,float n8) {
		return(n7/n8);
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println(cal.add(8, 10));
		System.out.println(cal.sub(10f, 5));
		System.out.println(cal.mul(8.5f, 5.5f));
		System.out.println(cal.div(8.6f, 2.2f));
	}
	
}
