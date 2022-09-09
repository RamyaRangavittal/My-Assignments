package week3.day1java;

public class StringReverse {

	public static void main(String[] args) {
		//Reverse even words
		
		String test="I am a software tester";
		
		String[] split= test.split(" ");
		
		for(int i=0;i<split.length;i++) {
			if(i%2==1) {
				
				char[] charArray= split[i].toCharArray();
				
				for(int j=charArray.length-1;j>=0;j--) {
					System.out.print(charArray[j]);
				}
				System.out.print(" ");
			}
			else {
				System.out.print(split[i]);
			}
			System.out.print(" ");
		}

	}

}
