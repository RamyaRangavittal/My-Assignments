package week3.day2java;

public class StringIntersection {

	public static void main(String[] args) {
		String s1="amrutha";
		String s2="samutha";
		
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		
		for(int i=0;i<charArray1.length-1;i++) {
			
			for(int j=0;j<charArray2.length-1;i++) {
				if(charArray1[i]==charArray2[j]) {
					System.out.print(charArray1[i]);
					
			
				}else {
					System.out.print("no");
					break;
					
					
					 
					
					
				}
			}
		}

	}

}
