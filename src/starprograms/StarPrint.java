package starprograms;

public class StarPrint 
{

	public static void main(String[] args) 
	{
		int i,j;
		for(i=1;i<=8;i++)
		{			
			for(j=1;j<=i;j++)
			{
				if(i%2!=0)
				{
					System.out.print("*");
					break;
				}
				else 
				{
					if(i==2)
					{
						for(j=1;j<=i;j++)
						{
						  System.out.print("*");
						}
					}
					else
					{
					for(j=1;j<=i-1;j++)
						{
						  System.out.print("*");
						}
					}
				}
			}
			System.out.println();
			
		}
	}
}
