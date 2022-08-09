package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int fN=0;
		int sN=1;
		int Sum=0;
		
	for (int i = 0; i <range; i++) {
	 Sum=fN+sN;
		fN=sN;
		sN=Sum;
	
		
	}
	
System.out.println(Sum);
	}

}
