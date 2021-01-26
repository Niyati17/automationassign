//Create a method and pass the row number and the method will read the data of particular line number

package pkjall;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class hw1 
{

public int readdata(int rowno) throws IOException
{
File f=new File("..//textfile/hw1.txt");
FileReader fw=new FileReader(f);
BufferedReader br=new BufferedReader(fw);
String s;
int intcountline=0;
while((s=br.readLine()) != null)
{
intcountline=intcountline+1;
if(intcountline==rowno)
	System.out.println(s);
}

return rowno;


}
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter the row number to read");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		hw1 h=new hw1();
		h.readdata(row);
	}
	
	
}
