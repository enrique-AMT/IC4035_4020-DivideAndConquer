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
		System.out.println(quickselect(a, 0, a.length-1, k));

	}
	public static Integer quickselect(int[] list, int leftIndex, int rightIndex, int k) {
        // Edge case
        if (k < 1 || k > list.length) {
            return null;
        }

        // Base case
        if (leftIndex == rightIndex) {
            return list[leftIndex];
        }

        // Partition the sublist into two halves
        int pivotIndex = partitionList(leftIndex, rightIndex, list);
        int sizeLeft = pivotIndex - leftIndex + 1;

        if (sizeLeft == k) {
            return list[pivotIndex];
        } else if (sizeLeft > k) {
            return quickselect(list, leftIndex, pivotIndex - 1, k);
        } else {
            return quickselect(list, pivotIndex + 1, rightIndex, k - sizeLeft);
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
