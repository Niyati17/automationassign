//((((x1+x2)-x3)+x4)*x5)/x6

package pkjall;

import java.util.Scanner;

public class classas1 
{
   public int sum(int x1, int x2)
   {
	   return x1+x2;                  
   }
   
   public int sub(int x1, int x2)
   {
	   return x1-x2;
   }
   
   public int mul(int x1, int x2)
   {
	   return x1*x2;
   }
   
   public void div(int x1, int x2)
   {
	   System.out.println("result is " +x1/x2);
   }
   public static void main(String[] args) 
   {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter value of x1:");
	int x1= s.nextInt();
	System.out.println("Enter value of x2:");
	int x2=s.nextInt();
	classas1 obj=new classas1();
	int m=obj.sum(x1, x2);
	System.out.println("Sum result is=" +m);
	
	System.out.println("Enter value of x3: ");
	int x3=s.nextInt();
	int n=obj.sub(m,x3);
	System.out.println("sub result is" +n);
	
	System.out.println("Enter value of x4");
	int x4=s.nextInt();
	int o=obj.sum(n,x4);
	System.out.println("sum result is" +o);
	
	System.out.println("Enter value of x5: ");
	int x5=s.nextInt();
	int p=obj.mul(o,x5);
	System.out.println("mul result is " +p);
	
	System.out.println("Enter value of ");
	int x6=s.nextInt();
	 obj.div(p, x6);
	s.close();

	
}
}
