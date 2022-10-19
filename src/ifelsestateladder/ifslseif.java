package ifelsestateladder;

public class ifslseif 
{
	public static void main(String[] args)
	{
	int totalmarks=80;
	
	if(totalmarks>=90)
	{
	   System.out.println("Atul Got A+ Grade");
		
	}
	
	else if(totalmarks<90&&totalmarks>=80 )
	{
		System.out.println("Atul Got A Grade");
	}  
	else if(totalmarks<80&&totalmarks>=70 )
	{
		System.out.println("Atul Got B+ Grade");
	}  
	else if(totalmarks<70&&totalmarks>=50 )
	{
		System.out.println("Atul Got B Grade");
	}
	else if(totalmarks<50&&totalmarks>=40 )
	{
		System.out.println("Atul Got C Grade");
	}  
	else 
	{
		System.out.println("Atul failed");
	}   
	
  }
}
