package pkjall;

public class doubleloopassignment 
{
	
public static void main(String[] args) 

{
	int a=1;
for(int i=0; i<=4; i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(a);	
a++;
}
System.out.println();
}
System.out.println("------------------------------------");

for(int i=1;i<=5;i++)
{
for (int j=5;j>=i;j--)
{
System.out.print(" ");	
}
for(int k=1;k<=i;k++)
{
	System.out.print("*");
}
System.out.println();
	}
}
}
