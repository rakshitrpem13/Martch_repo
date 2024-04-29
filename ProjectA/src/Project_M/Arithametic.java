package Project_M;

public class Arithametic 
{
	public int sum(int x,int y)
	{
   int z;
	z=x+x;
	System.out.println("value of"+z);
	return z;
	}
	public int sub(int x1, int y1)
	{
		int z1;
		z1=x1-y1;
		System.out.println("value of"+z1);
		return z1;
	}
	public int mul(int x2,int y2)
	{
		int z2;
		z2=x2*y2;
		System.out.println("value of"+z2);
		return z2;
	}
	
	public static void main(String[] args) {
		Arithametic a=new Arithametic();
		int sumresult=a.sum(10, 2);
		int subresult=a.sub(sumresult, 2);
		a.mul(sumresult, subresult);
	}
	
	
}

