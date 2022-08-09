package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int i=34343;
		int j;
		int r;
		int s=0;
	
		
		
	
		for(j=i;j>0;j/=10) {
			
			
			r=j%10;

		 s=(s*10)+r;
		 
		}
		if(s==i) {
			
			System.out.println(i +" - is a palindrome");
			
	}
		else
		{
			System.out.println(i +" - is not a palindrome");
			
		}


}
}