package StaticNonstaticmethods;
public class ReturNonReturn 
{
public static void addition()
{
	int a=100;
	int b=200;
	int c=a+b;
	System.out.println("static method NO return  "+c);
}
public static int addition1()
{
	int a=1000;
	int b=2000;
	int c=a+b;
	System.out.println("static method returning value  "+c);
	return c;
}
public  void substraction()
{
	int a=10;
	int b=20;
	int c=b-a;
	System.out.println(" Non static method NO return  "+c);
}
public  int substraction1()
{
	int a=300;
	int b=400;
	int c=b-a;
	System.out.println("Non static method returning value  "+c);
	return c;
}
public static void main(String[] args)
{
	addition();
	int add= addition1();
	System.out.println("static method returning value in main method "+(add+10));
	ReturNonReturn atul=new ReturNonReturn();
	atul.substraction();
	int sub =atul.substraction1();
	atul.addition();
	int a1=atul.addition1();
	 
	System.out.println("non static method returning value in main method "+(sub-1));
}
}
