package add;

public class Add3 
{
public static void main(String[] args)
{
	
	Add2 b= new Add2();
	 
	int m =b.additon1();
	int n=b.additon2();
	int tot=m+n;
	System.out.println("Addition 1="+m);
	System.out.println("Addition 2="+n);
	System.out.println("Total="+tot);
	
}
}
