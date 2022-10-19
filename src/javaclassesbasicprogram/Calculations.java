package javaclassesbasicprogram;

public class Calculations
{
public static void main(String[] args) 
{
	Addition add=new Addition();
	Substraction sub=new Substraction();
	Division div= new Division();
	Multiplication mul=new Multiplication();
	
	System.out.println("additon program ");
	add.additon();
	
	System.out.println("substracttion program ");
	sub.substraction();
	
	System.out.println("multiplication program ");
	mul.multiply();
	
	System.out.println("division program ");
	div.division();
}
}
