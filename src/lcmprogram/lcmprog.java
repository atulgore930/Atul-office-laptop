package lcmprogram;

public class lcmprog
{
public static void main(String[] args)
{
	int a=12,b=24;
	int i,c=1,lcm;
	
	
	for(i=1;i<=a && i<=b;i++)
		{
		if(a % i==0 && b % i==0)
			c=i;
		}
	lcm=(a*b)/c;
	System.out.println("lcm is "+lcm);
	System.out.println("gcd of 8&6 is="+c);
			
	}

}
