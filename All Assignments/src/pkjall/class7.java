//(((10-2)+2)+2)-2)*2)/2)
package pkjall;

public class class7 {
	public int sub (int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("sub result is"  +c);
		return c;
	}
	
	public int sum (int a, int b)
	{
		int d;
		d=a+b;
		System.out.println("sum result is " +d);
		return d;
	}
	
	public int mul (int a, int b)
	{
		int e;
		e=a*b;
	  System.out.println("mul result is" +e);
	  return e;
				
	}
	
	public void div (int a, int b)
	{
		int f;
		f=a/b;
		System.out.println("div result is" +f);
		
	}

	public static void main(String[] args) {
		class7 obj=new class7();
		int x=obj.sub(10, 2);
		int y=obj.sum(x, 2);
		int z=obj.sum(y, 2);
		int m=obj.sub(z, 2);
		int n=obj.mul(m, 2);
		obj.div(n, 2);
	}
}
