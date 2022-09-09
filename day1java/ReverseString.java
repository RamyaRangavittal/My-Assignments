package week3.day1java;

public class ReverseString {

	public static void main(String[] args) {
		String name= "Ramya";
		String rev="";
		//int length = name.length();

		char[] charArray = name.toCharArray();
		for(int i=charArray.length-1;i>=0;i--)
		{
			rev=rev+charArray[i];
		}
	
	System.out.println("original string:  "+    name);
	System.out.println("Reversed string:  "+    rev);
	}

}
