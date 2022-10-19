package oopscocepts;

public class constructorpro1 
{
	
	
		static int x;           //var declaration
		static int y;    
	  static  int z;
		
		//var initialize -->const use
		//dont use datatYpe in const syntax
		//const name == className
		//1.const
		public static int method2()
		{
			x = 10;
		
			y = 20;
			
			z=x+y;
			
			return z;
			
		}
		public static void main(String[] args) 
		{
		constructorpro1 rahul=new constructorpro1();	
		
		System.out.println(method2());              //methodname calling
		constructorpro1.method2();                  //classname calling
		 
			
		}

}
