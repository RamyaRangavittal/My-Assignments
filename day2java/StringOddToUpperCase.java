package week3.day2java;

public class StringOddToUpperCase {

	public static void main(String[] args) {
		String word="Ramya";
		
		
		char[] charArray= word.toCharArray();
		for(int i=0;i<=charArray.length-1;i++) {
        if(i%2==0) {
				
				
				System.out.print(Character.toUpperCase(charArray[i]));
				
				
			
		}else {
			System.out.print(charArray[i]);
			
	}}

	}}
