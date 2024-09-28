package demos;

import java.util.Arrays;

public class ArrayOperationsDemo {

	public static void main(String[] args) {
		String [] words = {"vishal","bhargav","dipali","meenal","sanah"};
		ArrayOperations.sort(words);
		System.out.println(Arrays.asList(words));
		
		ArrayOperations.rotate(words,2);
		System.out.println(Arrays.asList(words));
		
		ArrayOperations.shuffle(words);
		System.out.println(Arrays.asList(words));
		
	}

}
