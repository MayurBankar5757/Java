package builtIn;

public class StringLen {
		
	public static void main(String []args) {
		
		for(int i =0; i<args.length; i++) {
			
			System.out.println(args[i]);
			
		}
		// Printing length of String from command Line
		
		
//		for(int i =0; i<args.length;i++) {
//			
//			System.out.println(args[i]+ " :" + args[i].length());
//		}
		
		
		// Searching for specific string
		String str = "one";
		
		for(int i =0; i<args.length; i++) {
			
			if(str.equals(args[i])) {
				
				System.out.println("Present");
				break;
			}
			else {
				
				System.out.println("Absent");
			}
		}
		
		
	}
}
