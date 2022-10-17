package OOPs_Project;
import java.util.*;

public class PalindromeDriver {

	public static void main(String[] args) {
		String str;
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter string");
		str=input.next();
		input.close();
		ValidatePalindrome val=new ValidatePalindrome(str);
		val.validation(str);

	}

}
