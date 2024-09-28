package useofgenerics;

import entities.Customer;

public class ArrayOperationsDemo {

	public static void main(String[] args) {
		Integer [] arr = {7,9,2,45,90};
		ArrayOperations.printArray(arr);    //x - Integer
		ArrayOperations.search(arr, 22);
		ArrayOperations.sort(arr);
		ArrayOperations.printArray(arr);
		
		String [] words = {"hello","welcome","object","java"};
		ArrayOperations.printArray(words);   //X - String
		ArrayOperations.search(words, "hello1");
		ArrayOperations.sort(words);
		ArrayOperations.printArray(words);
		
		Customer [] custs = {new Customer(),new Customer(),new Customer()};
		//ArrayOperations.sort(custs);
	}

}
