package OOPs_Project;

import java.util.*;
public class SumIndices {
	 
 
 public static int[] checkingSum(int arr[],int target)
 {
	 int size= arr.length;
	 int arr2[]=new int[2];
	 for(int i=0; i<size;i++)
		for(int j=i+1;j<size;j++)
			if(arr[i]+arr[j]==target)
			{
				arr2[0]=i;
				arr2[1]=j;
			}
	 return arr2;
 }
  
 public static void main(String[] args)
 {
	 int arr[] = new int[10];
	 
	 int n, target;
	 Scanner input=new Scanner(System.in);
	 System.out.println("Please enter size of array");
	 n=input.nextInt();
	 System.out.println("Please enter array elements");
	 for(int i=0;i<n;i++)
		 arr[i]=input.nextInt();
	 System.out.println("Please enter target");
	 target=input.nextInt();
	 input.close();
	 

	 System.out.println(Arrays.toString(checkingSum(arr,target)));
	
 }
}
 

