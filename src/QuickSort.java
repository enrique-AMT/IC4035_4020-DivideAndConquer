import java.util.Comparator;
import java.util.Scanner;

public class QuickSort {
	
	public static void main(String[] args){
		Scanner p = new Scanner(System.in);
		int size= p.nextInt();
		int[] a=new int[size];
		p.nextLine();
		String elements= p.nextLine();
		String[] values= elements.split(" ");
		for(int i=0; i<values.length;i++){
			a[i]=Integer.parseInt(values[i]);
		}
		qs(0, size-1, a);
		for(int i=0 ; i<a.length ; i++){
			System.out.print(a[i] + " ");
}
	}
	
	
private static void qs(int first, int last, int[] elements) {
		
		if(first<last){
			int partition= partitionList(first, last, elements);
			qs(first, partition-1, elements);
			qs(partition+1, last, elements);
		}
	
	}
	private static int partitionList(int first, int last, int[] elements) { 
		Integer pivot = elements[last]; 
		int left = first, right = last-1; 
		
		while (left <= right) {
			while (left <= right &&elements[left]<pivot)
				left++; 
			while (left <= right && elements[right]>pivot)
				right--; 
			if (left < right) {
				swapArrayElements(elements, left, right); 
				left++; 
				right--; 
			}
		}
		swapArrayElements(elements, left, last); 

		return left; 

	}
	public static void swapArrayElements(int[] arr, int i, int j) { 
		int p= arr[i];
		arr[i]=arr[j];
		arr[j]=p;
}
}
