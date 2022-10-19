package methodoverloading;

public class methodoverloading 
{
	
public static void method1()
{
	System.out.println("method 1 calling");
}

	public static void method1 (int a)
	{
		System.out.println("atul-method 1 calling");
		
	}
	public static void method1(int a,char b)
	{
		System.out.println("umk-method1 calling");
		
	}
	public static int method1(int x,int y)
	{
		System.out.println("aa calling");
		return 100;
		
	}
	public void  method1 (int d,int e,char c)
	
	{
		d=20;
		e=90;
		int k=d+e;
		System.out.println("additionof k is"+k);
	}
public static void main(String[] args) 
{
	method1();
	method1(10);
	method1(11,'a');
	int m=method1(10,20);
	System.out.println("m="+m);
	methodoverloading t=new methodoverloading();
	t.method1(70,80,'g');
			
}
}
