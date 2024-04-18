package Project_M;

public class Const 
{
	public Const() 
	{
		this(1, 2);
		System.out.println("default constructor");
	}
	public Const(int a)
	{
	System.out.println("one paramterized constructor");	
	}
	public Const(int a,int b)
	{
		this(1);
	System.out.println("two parameterized constructor");	
	}
public static void main(String[] args) 
{
	Const n=new Const();
}
}
