//((((10*2)-2)+2)*2)+2)/2)

package pkjall;

public class Class3 {
	public int mul (int a, int  b)
	{
		int c;
		c=a*b;
		System.out.println("mul result is"  +c);
		return c;
	}
	
	public int sub (int a, int b)
	{
		int d;
		d=a-b;
		System.out.println("sub result is" +d);
		return d;
	}
	
	public int sum(int a, int b)
	{
	int e;
	e=a+b;
	System.out.println("sum result is"  +e);
	return e;	
	}
	
	public void div(int a, int b)
	{
		int f;
		f=a/b;
		System.out.println("Result is"  +f);
		
	}
	
	public static void main(String[] args) {
		
		Class3 obj3=new Class3();
		int x=obj3.mul(10, 2);
		int y=obj3.sub(x, 2);
		int z=obj3.sum(y,2);
		int m=obj3.mul(z,2);
		int n=obj3.sum(m,2);
		obj3.div(n, 2);
		
		
	}

}
