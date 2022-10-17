package OOPs_Project;

import java.util.*;

public class LargestNumber {
	static void printLargest(Vector<String> arr)
    {
 
        Collections.sort(arr, new Comparator<String>()
        {
           
            @Override 
            public int compare(String X, String Y)
            {
 
              String XY = X + Y;
              String YX = Y + X;
             return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });
 
        Iterator loop = arr.iterator();
 
        while (loop.hasNext())
            System.out.print(loop.next());
    }
 
   
    public static void main(String[] args)
    {
 
        Vector<String> arr;
        arr = new Vector<>();
        int size;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the size of array");
        size=input.nextInt();
        System.out.println("Please enter elements");
        for(int i=0;i<size;i++)
        	arr.add(input.next());
        printLargest(arr);
    }
}

