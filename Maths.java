package week1.day1;

public class Maths {
	public int add(int a,int b)
	{
		
	return(a+b);
			
		
	}
	public int multiply(int a,int b)
	{
		return(a*b);
	}
	public int divide(int a,int b)
	{
		return(a/b);
		
	}
	public static void main(String[] args) {
		Maths maths =new Maths();
	int c =maths.add(10,10);
		
		int d =maths.multiply(10,5);
		int e = maths.divide(20,5);
		int f= c+d;
		
		System.out.println("Addition:"+c);
		System.out.println("Multiply:"+d);
		System.out.println("Division:"+e);
		System.out.println("sumofc and d:"+f);
		
	}

}
