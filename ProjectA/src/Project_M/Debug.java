package Project_M;

public class Debug {
	int abc;
	
	public void m1()
	{
		System.out.println("methid1");
	}
	public void m2()
	{
		System.out.println("Method2");
	}
	public static void main(String[] args) 
	{
		System.out.println("first line of mian method");
		System.out.println("second line of mian method");
		Debug d = new Debug();
		d.abc=122;
		System.out.println("value of d"+d.abc);
		d.abc=144;
		System.out.println("value d"+d.abc);
		d.m1();
		d.m2();
		
	}

}
