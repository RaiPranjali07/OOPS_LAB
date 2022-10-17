package OOPs_Project;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
     int n,x;
     int result=1;
     System.out.println("Please enter number");
     n=input.nextInt();
     System.out.println("Please enter power");
     x=input.nextInt();
     for(int i=1;i<=x;i++)
    	  result*=n;
     System.out.println("Result: "+result);
	}

}
