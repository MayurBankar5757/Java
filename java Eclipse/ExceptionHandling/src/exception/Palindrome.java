package exception;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		boolean flag = false;
		String str = sc.nextLine();
		
		
		for(int i=0; i< str.length(); i++) {
			
			for(int j = str.length()-1; i<=j; j-- ) {
				
				if(str.charAt(i) == str.charAt(j)) {
					
					flag = true;
				}
				else {
					flag = false;
				}
			}
			
			
		}
		if(flag) {
			
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not Palindrome String");
		}
		
		
	}

}
