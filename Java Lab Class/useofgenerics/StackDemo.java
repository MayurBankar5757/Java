package useofgenerics;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> names = new Stack<>();
		System.out.println("Empty : "+names.isEmpty());
		try {
			names.push("a");
			names.push("b");
			names.push("c");
			names.push("d");
			names.push("e");
			names.push("f");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Empty : "+names.isEmpty());
		System.out.println("Full : "+names.isFull());
		System.out.println("**********");
		names.display();
		System.out.println("Popped out : "+names.pop());
		System.out.println("**********");
		names.display();
	}

}
