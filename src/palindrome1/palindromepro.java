package palindrome1;

public class palindromepro
{
	public static void main(String[] args)
	{
		int a=151;
		int mod=a;
		int rem;
		int num=0;
		while(mod>1)
			{
			mod=mod/10;
			rem=mod%10;
			num=num*10+mod;
			
			}
		
			if(num==a)
			{
				System.out.println("given no is palindrome "+a);
			}
			else
			{
				System.out.println("no not palindrome"+a);
		 
			}
	
	}
	
}
