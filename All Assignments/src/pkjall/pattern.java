package pkjall;

public class pattern
{
public static void main(String[] args)
{
for(int i=1;i<=5;i++)
{
int l=(2*i)+1;
for(int j=5;j>=i;j--);
{
System.out.print(" ");	
}
for(int k=3;k<=l;k++)
		{
			System.out.print("*");
		}

System.out.println();
}
}
}