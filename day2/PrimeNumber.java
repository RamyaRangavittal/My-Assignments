package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int i=13;
		int k;
	int flag =0; 
	int j=i/2;
	
	if(i==0||i==1) {
		System.out.println("This number is not a Prime number");
		
	}else
		for(k=2;k<=j;k++) {
			if(i%k==0) {
				System.out.println("This number is not a Prime number");
				flag=1;
				break;
			}
					
		}
				if(flag==0) {
					System.out.println("This number is a Prime number");
				
				
			
		}
	
	}

}
