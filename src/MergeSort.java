import java.util.Scanner;

public class MergeSort {
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
		ms(0, size-1, a);
		for(int i=0 ; i<a.length ; i++){
			System.out.print(a[i] + " ");
}
	}
	private static void ms(int first, int last, int[] elements) {
		int mid=(first+last)/2;
		if(first<last){
			
			
			ms(first, mid, elements);
			
			ms(mid+1, last, elements);
			
			merge(first, mid, last, elements);
		}
		
		
	
}
	private static void merge(int first, int mid, int last, int[] elements) {
	     int[] tempList = new int[last-first+1]; 
	     int index1 = first, index2 = mid+1; 
	     int last1 = mid, last2 = last; 
	     int indexTL = 0;
	     while (index1 <= last1 && index2 <= last2) 
	         if (elements[index1]<= elements[index2])
	             tempList[indexTL++] = elements[index1++]; 
	         else 
	             tempList[indexTL++] = elements[index2++];


	     // move the remaining data to tempList -- notice that only one 
	     // of the following loops will iterate at least once
	     while (index1 <= last1) 
	         tempList[indexTL++] = elements[index1++];
	     while (index2 <= last2) 
	         tempList[indexTL++] = elements[index2++];
			
	     // put sorted data back to the list portion....
	     for (int i=0; i<tempList.length; i++) 
	    	 elements[first+i]=tempList[i]; 		
			
}
	
	
	
	
	public static void swapArrayElements(int[] arr, int i, int j) { 
		int p= arr[i];
		arr[i]=arr[j];
		arr[j]=p;
}
}
