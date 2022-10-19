package nestedif;

public class Nestedifprogramblood
{
	public static void main(String[] args)
	{
	int age=19;
	int weight=61;
		if(age>18)
		{
		  System.out.println("your age is above 18");
		
		  
	      if(weight>60)
	       {
		     System.out.println(" donate the  blood");
	       }
	     else
	      {
		   System.out.println("not eligible  due to weight criteria ");
	   
	      }
		}
	   else
	   {
		   System.out.println("not eligible for due to age criteria ");
	   }
	   System.out.println("end of program");
		}
		
	   
	}


