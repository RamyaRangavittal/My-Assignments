package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,9,11};
		
		Arrays.sort(arr);
		int iterationA=1;
		
		for(int i=0;i<arr.length;i++) {
			
			if(!(iterationA==arr[i])) {
				System.out.println("iteration is not equal to " +iterationA);
				break;
			}
			iterationA++;
		}
		
		

	}

}
