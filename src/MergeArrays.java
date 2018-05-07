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
		p.nextLine();
		int size2= p.nextInt();
		p.nextLine();
		int[] a2= new int[size2];
		String elements2=p.nextLine();
		String[] values2=elements2.split(" ");
		for(int i=0;i<values2.length;i++){
			a2[i]=Integer.parseInt(values2[i]);
		}
		int[] arr= new int[size1+size2];
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(arr[i] + " ");
			
		p.close();
}
	}
}
