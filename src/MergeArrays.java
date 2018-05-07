import java.util.Scanner;

public class MergeArrays {
	public static void main(String[] args){
		Scanner p = new Scanner(System.in);
		int size1= p.nextInt();
		int[] a1=new int[size1];
		p.nextLine();
		String elements1= p.nextLine();
		String[] values1= elements1.split(" ");
		for(int i=0; i<values1.length;i++){
			a1[i]=Integer.parseInt(values1[i]);
		}
		int size2= p.nextInt();
		
		int[] a2= new int[size2];
		p.nextLine();
		String elements2=p.nextLine();
		String[] values2=elements2.split(" ");
		for(int i=0;i<values2.length;i++){
			a2[i]=Integer.parseInt(values2[i]);
		}
		int[] arr= new int[size1+size2];
		merge(a1, a2, arr, size1, size2);
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(arr[i] + " ");
			
		p.close();
}
	}
	
	private static void merge(int[] a1, int[] a2, int[] a3, int n1, int n2){
		 int i = 0, j = 0, k = 0;
	     
	        // Traverse both array
	        while (i<n1 && j <n2)
	        {
	            // Check if current element of first
	            // array is smaller than current element
	            // of second array. If yes, store first
	            // array element and increment first array
	            // index. Otherwise do same with second array
	            if (a1[i] < a2[j])
	                a3[k++] = a1[i++];
	            else
	                a3[k++] = a2[j++];
	        }
	     
	        // Store remaining elements of first array
	        while (i < n1)
	            a3[k++] = a1[i++];
	     
	        // Store remaining elements of second array
	        while (j < n2)
	            a3[k++] = a2[j++];
	}
}
