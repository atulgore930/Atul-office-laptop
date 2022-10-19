package starprograms;

public class inclinedstar 
{
	public static void main(String[] args)  
	{
		int cnt ;
		for(int i=1;i<=5;i++)
		 {
			cnt=0;
			for(int j=4;j>=i;j--)
				{
					System.out.print(" ");
					cnt=cnt+1;
				}
			if(i==5)
			{
			for(int m=1;m<=5;m++)
			{
				System.out.print(" *");
			}
		}
		
		for(int k=1;k<=i;k++)
		{
			if(i!=5)
			{
				System.out.print(" *");
			}
			else
			{
				break;
			}
			
		}
		System.out.println();
					
		}	
	
	}
}
	


