//(x1*x2)-x3)+x4)-x5)/x6)

package pkjall;

import java.util.Scanner;

public class classas2 
{
public int mul(int x1, int x2)
{
	return x1*x2;
}

public int sub(int x1, int x2)
{
	return x1-x2;
	}

public int sum(int x1, int x2)
{
return x1+x2;	
}

public int div(int x1, int x2)
{
	return x1/x2;
	}

public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter value of x1:");
	int x1= s.nextInt();
	System.out.println("Enter value of x2");
	int x2=s.nextInt();
	classas2 obj=new classas2();
	int a=obj.mul(x1,x2);
	System.out.println("mul resul is" +a);
	
	System.out.println("Enter value of x3:");
	int x3=s.nextInt();
	int b=obj.sub(a,x3);
	System.out.println("sub result is" +b);
	
	System.out.println("Enter value of x4:");
	int x4=s.nextInt();
	int c=obj.sum(b,x4);
	System.out.println("sum result is" +c);
	
	System.out.println("Enter value of x5:");
	int x5=s.nextInt();
	int d=obj.sub(c,x5);
	System.out.println("sub result is" +d);
	
	System.out.println("Enter the value of x6");
	 int x6=s.nextInt();
	obj.div(d, x6);
	System.out.println("Final result is" +x6);
	s.close();
	
	
}
}

