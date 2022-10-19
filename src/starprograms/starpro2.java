package starprograms;

public class starpro2 
{
public static void main(String[] args)
{
	int i,j,h,k;
	
	for( i=1;i<=5;i++)
	 {
		for( j=5;j>=i;j--)
		{
			if(i==j)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		
	 }
	for( h=1;h<=4;h++)
	{
		for( k=1;k<=h;k++)
		{
			if(h==k)
			{
				System.out.print(" *");
				
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	}

		
	

	


}

