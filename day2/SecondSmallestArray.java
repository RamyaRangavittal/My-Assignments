package week1.day2;

import java.util.Arrays;

public class SecondSmallestArray {
	public static void main(String[] args) {
		int []i = {5,4,9,3,7};
		
		int length=i.length;
		
		Arrays.sort(i);
		System.out.println("Second smallest number is:"  + i[length-4]);
		
		}
			

}
