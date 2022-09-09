package week3.day2java;

import java.util.ArrayList;
import java.util.List;

public class ListLearning {
	public static void main(String[] args) {
		
		String[] N= {"Adam","Ben", "Zara", "Adam", "Charlie", "James", "Ben"};
		List <String>names = new ArrayList <String>();
		for(int i=0;i<N.length;i++) {
			names.add(N[i]);
			System.out.println(names);
		}
		
		
	}

}
