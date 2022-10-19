package scanner;
 import java.util.Scanner;
public class Scannnerclass 
{
public static void main(String[] args)
{
	Scanner d=new Scanner(System.in);
	System.out.println("Enter two no");
	int a=d.nextInt();
	
	int b=d.nextInt();
	
	int c=a+b;

	System.out.println("sum="+c);
}
}
