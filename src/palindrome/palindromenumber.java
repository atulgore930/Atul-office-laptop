package palindrome;

public class palindromenumber
{
	public static void main(String[] args)
	{
		int number=101;
		int temp=number;
		int rev=0;      //suppose.
		int rem;
		while(number!=0)
		{
			
		rem =number%10;
			rev=(rev*10)+rem;
			number=number/10;
		}
		if(temp==rev)
		System.out.println("the given no is palindrome");
		else
		{
			System.out.println("no is not palindrome");
		}
	}


}
