package useofgenerics;

public class ArrayOperations {

	static <X> void printArray(X[] arr) {
		System.out.println("Printing elements .....");
		for(X ele : arr)
			System.out.println(ele);
	}
	
	static <T>void search(T [] arr, T ele) {
		boolean flag = false;
		for(T element : arr) {
			if(element.equals(ele)) {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("present");
		else
			System.out.println("Not present");					
	}
	
	static <T extends Comparable<T>> void sort(T [] arr) {
		//compareTo
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}
}
