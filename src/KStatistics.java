import java.util.Scanner;

public class KStatistics {
	public static void main(String[] args){
		Scanner p = new Scanner(System.in);
		String arguments= p.nextLine();
		String[] values0= arguments.split(" ");
		int size= Integer.parseInt(values0[0]);
		int k= Integer.parseInt(values0[1]);
		int[] a=new int[size];
		String elements= p.nextLine();
		String[] values= elements.split(" ");
		for(int i=0; i<values.length;i++){
			a[i]=Integer.parseInt(values[i]);
		}
		qs(0, size-1, a);
		System.out.println(a[k-1]);

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
