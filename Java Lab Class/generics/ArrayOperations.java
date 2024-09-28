package demos;

import java.util.Random;

public class ArrayOperations {
  static <X>boolean search(X[]arr, X ele) {
	  boolean flag = false;
	  for(X element : arr){
		  if(element == ele) {
			  flag=true;
			  break;
		  }
	  }
	  return flag;
  }  
  static <T extends Comparable<T>> void sort(T[]arr) {
	  T temp;
	  for(int i=0;i<arr.length-1;i++) {
		  for(int j=i+1;j<arr.length;j++) {
			  if(arr[i].compareTo(arr[j]) > 0) {
				  temp = arr[i];
				  arr[i] = arr[j];
				  arr[j] = temp;
			  }
		  }
	  }		  
  }
  
  static <T> void rotate(T[] arr, int positions) {
	  T temp;
	  for(int i=0;i<positions;i++) {
		  temp = arr[arr.length-1];
		  for(int j=arr.length-1;j>0;j--) {
			  arr[j] = arr[j-1];
		  }
		  arr[0] = temp;
	  }
  }
  
  static <T> void shuffle(T[] arr) {
	  T temp;
	  Random r = new Random();
	  for(int i=0;i<arr.length;i++) {
		  int random_index = r.nextInt(arr.length);
		  temp = arr[random_index];
		  arr[random_index] = arr[i];
		  arr[i] = temp;
	  }
  }
  
}
