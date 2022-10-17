package OOPs_Project;
import java.util.*;
public class VendingMachine {
	
 String cartarr[]=new String[5];
 int size;
 Scanner input=new Scanner(System.in);
 
// public VendingMachine(int count)
// {
//	 this.size=size;
//	String cartarr[]= new String[size];
// }
 
	
	  public void customer() {
	  
	  int i=0,count=0; 
	  String response; 
	  do { 
      System.out.println("ITEMS");
	  System.out.println("MensDress     Rs 2000");
	  System.out.println("WomensDress   Rs 3000");
	  System.out.println("KidsDress     Rs 1500 ");
	  System.out.println("GroceryItems  Rs 200");
	  System.out.println("CrockeryItems Rs 4000");
	  System.out.println("Please select the product"); 
	  cartarr[i++]=input.next();
	  count++; 
	  System.out.println("Do you want to add more products: Y/N");
	  response=input.next(); 
	  }while(response.equals("Y"));
	  
	  System.out.println("Your Items are:"); 
	  for( i=0;i<count;i++)
	  System.out.println(cartarr[i]);
	  
	  }
	 

 


public float calcPrice()
 {
	 float price=0;
	
	 String ModeofPayment;
	 System.out.println("Please select mode of payment: Cash/Card");
	 ModeofPayment=input.next();
	 for(int i=0;i<cartarr.length;i++)
		 {
			 if( cartarr[i]!=null &&  cartarr[i].equals("MensDress"))
				 price+=2000;
			 else if(cartarr[i]!=null &&  cartarr[i].equals("WomensDress"))
				 price+=3000;
			 else if(cartarr[i]!=null &&  cartarr[i].equals("KidsDress"))
				 price+=1500;
			 else if(cartarr[i]!=null &&  cartarr[i].equals("GroceryItems"))
				 price+=200;
			 else if (cartarr[i]!=null &&  cartarr[i].equals("CrockeryItems"))
				 price+=4000;
		 }
     
if(ModeofPayment.equals("Card"))	
   return 2*price; 
else
   return price;	 
 }

}
