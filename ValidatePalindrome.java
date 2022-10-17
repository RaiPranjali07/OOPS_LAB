package OOPs_Project;


public class ValidatePalindrome {
   String str;
   
   public ValidatePalindrome(String str)
   {
	   this.str=str;
   }
   
   public void validation(String str)
   {
	   String rev="";
	   int i;
	   
	   //for(i=str.length(); i>0; i--)
	   for(i=str.length()-1; i>=0; i--)
	   {
		  rev=rev+str.charAt(i);
	   }
       if(str.equalsIgnoreCase(rev))
         System.out.println("String is palindrome");
       else
    	 System.out.println("String is not palindrome");

   }
}
