package OOPs_Project;

import java.util.Scanner;

public class VendingMachineDriver {
	
	

	public static void main(String[] args) {
		
		
//		  int i=0,count=0; 
//		  String cartarr[]=new String[5];
//		  Scanner input=new Scanner(System.in);
//		  String response; 
//		  do { 
//	      System.out.println("ITEMS");
//		  System.out.println("MensDress     Rs 2000");
//		  System.out.println("WomensDress   Rs 3000");
//		  System.out.println("KidsDress     Rs 1500 ");
//		  System.out.println("GroceryItems  Rs 200");
//		  System.out.println("CrockeryItems Rs 4000");
//		  System.out.println("Please select the product"); 
//		  cartarr[i++]=input.next();
//		  count++; 
//		  System.out.println("Do you want to add more products: Y/N");
//		  response=input.next(); 
//		  }while(response.equals("Y"));
//		  
//		  System.out.println("Your Items are:"); 
//		  for( i=0;i<count;i++)
//		  System.out.println(cartarr[i]);
		  
		  VendingMachine VM=new VendingMachine();
		  VM.customer();
		  System.out.println("Total Price: " +VM.calcPrice());
		  
		  }
		

	}


