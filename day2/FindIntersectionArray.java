package week1.day2;

public class FindIntersectionArray {
	
		
		public static void main(String[] args) {
			int[] n = {3,2,9,4,6,7};
			int[] m = {1,0,8,4,9,7};
			for (int i=0; i< n.length; i++)
			{
				for(int j=0; j< m.length; j++)
				{
					if(n[i] == m[j])
						System.out.println(n[i]);
				}
			}
		}

	}
