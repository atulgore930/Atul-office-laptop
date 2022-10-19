package primenumber;

public class primeno1to100
{
	public static void main(String[] args) 
	{
	   
	      int i =0;
	      int num =0;
	      int k=0;
	      
	 //     System.out.println("prime no's are in between 1 to 100:");
	   
	      for (i = 1; i <= 100; i++)  	   
	      { 		 	
	    	  
	         int mm=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			mm = mm + 1;
		    }
		 }
		 if (mm ==2)
		 {
		    
			 k=k+1;
			 
	      System.out.println(k+") "+i);
	      
	     
	   }
		
	
	      }}
	}


