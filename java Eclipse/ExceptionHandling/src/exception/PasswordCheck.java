package exception;

import java.util.Scanner;

public class PasswordCheck {

	private static boolean NumFlag;
	private static boolean capCharFlag;
	private static boolean spceFlag;
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		String pass = sc.nextLine();
		
		
		
		
	}
	public static void checkpwd(String pass) {
		
		for(int i=0; i<pass.length(); i++) {
			
			if(pass.charAt(i)>32 && pass.charAt(i)<126) {
				
				if(pass.charAt(i)>='A'&& pass.charAt(i)<='Z') {
					
					 NumFlag = true;
				}
				else if(pass.charAt(i)>='0'&& pass.charAt(i)<='9') {
					capCharFlag = true;
				}
				else if(!(pass.charAt(i)>='0'&& pass.charAt(i)<='9') && !(pass.charAt(i)>='A'&& pass.charAt(i)<='Z')) {
					
					  spceFlag = true;
				}
			}
		}
	}
}
