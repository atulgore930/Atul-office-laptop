package StaticNonstaticmethods;

public class nonstaticmethodinsingleclass 
{

	 public int Addition()
	    {
		   int a,b;
		   a=100;
		   b=200;
		   int sum=a+b;
		   return sum;
		  // System.out.println("addition="+sum);
		}
	    
	    public void Substraction()
	    {
		   int a,b;
		   a=100;
		   b=200;
		   int sub=b-a;
		   System.out.println("substraction="+sub);
		}
	    
	    public void Multiplication()
	    {
		   int a,b;
		   a=100;
		   b=200;
		   int mul=b*a;
		   System.out.println("multiplicaction="+mul);
		   
		}
	    
	    public void division()
	    {
		   int a,b;
		   a=100;
		   b=200;
		   int div=b/a;
		   System.out.println("division="+div);
		}
}
