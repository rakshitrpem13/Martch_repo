package Project_M;

import java.util.Scanner;

public class Del {
	
	public int sum(int x1,int x2)
	{
		int x3;
		x3=x1+x2;
		return x3;
	}
	public int mul(int x4,int x5)
	{
		int x6;
		x6=x4*x5;

		return x6;
	}
	public int sub(int x7,int x8)
	{
		int x9;
		x9=x7-x8;
		return x9;
	}
	public int div(int x10,int x11)
	{
		int x12;
		x12=x10+x11;
		return x12;
	}
	public static void main(String[] args) 
	{
		Del ab = new Del();
		Scanner sc= new Scanner(System.in);
		System.out.println("value of a");
		int a=sc.nextInt();
		System.out.println("value of b");
		int b=sc.nextInt();
		System.out.println("value of c");
		int c=sc.nextInt();
		System.out.println("value of d");
		int d=sc.nextInt();
		System.out.println("value of e");
		int e=sc.nextInt();
System.out.println("value of f");
int f=sc.nextInt();

		int mulresult=ab.mul(a, b);
		int sumresult=ab.sum(mulresult, c);
		int subresult=ab.sub(sumresult, d);
		int sumresult1=ab.sum(subresult, e);
		int divresult=ab.div(sumresult1, f);
		System.out.println("final result is"+divresult);
}
}
