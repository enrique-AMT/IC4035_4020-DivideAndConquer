import java.util.Scanner;

public class Heapify {
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
		for(int r=(size-2)/2; r>=0; r--)
			downHeap(r, size, a);
		for (int i = size-1; i>0; i--) { 
			swapArrayElements(a, i, 0);
			downHeap(0, i, a); 
}
		for(int i=0 ; i<a.length ; i++){
			System.out.print(a[i] + " ");
		}
}
		
		private static int left(int r) { 
			return 2*r+1; 
		}
		private static int right(int r) { 
			return 2*r+2; 
		}
		private int parent(int r) { 
			return (r-1)/2; 
		}
		
		private static boolean hasLeft(int r, int n) { 
			return left(r) < n; 
		}
		
		private static boolean hasRight(int r, int n) { 
			return right(r) < n; 
		}
		
		private static void downHeap(int r, int n, int[] a) { 
			// r is a root of a subtree in the complete tree formed
			// by the first n elements in dataSet --- 0..n-1
			boolean isHeap = false; 
			while (!isHeap && hasLeft(r, n)) { 
				int mci = left(r); 
				if (hasRight(r, n) && a[right(r)]< a[mci])
					mci = right(r); 
				if (a[mci]< a[r]) { 
					swapArrayElements(a, r, mci); 
					r = mci; 
				}
				else 
					isHeap = true; 
					
			}
	}
		public static void swapArrayElements(int[] arr, int i, int j) { 
			int p= arr[i];
			arr[i]=arr[j];
			arr[j]=p;
	}
}
