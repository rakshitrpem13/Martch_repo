package Project_M;

import java.util.Scanner;

public class Unknown {
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int mul(int d,int e)
	{
		int f;
		f=d*e;

		return f;
	}
	public int sub(int a1,int b1)
	{
		int c1;
		c1=a1-b1;
		return c1;
	}
	public int div(int d1,int e1)
	{
		int f1;
		f1=d1+e1;
		return f1;
	}
	public static void main(String[] args) 
	{
		Del ab = new Del();
		Scanner sc= new Scanner(System.in);
		System.out.println("value of a");
		int x1=sc.nextInt();
		System.out.println("value of b");
		int x2=sc.nextInt();
		System.out.println("value of c");
		int x3=sc.nextInt();
		System.out.println("value of d");
		int x4=sc.nextInt();
		System.out.println("value of e");
		int x5=sc.nextInt();
System.out.println("value of f");
int x6=sc.nextInt();

		int mulresult=ab.mul(x1,x2);
		int sumresult=ab.sum(mulresult, x3);
		int subresult=ab.sub(sumresult, x4);
		int sumresult1=ab.sum(subresult, x5);
		int divresult=ab.div(sumresult1, x6);
		System.out.println("final result is"+divresult);
}
}


