//Reading data between particular range
package pkjall;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class hw2
{
public static void main(String[] args) throws IOException
{
File f=new File("..//textfile/assig2.txt")	;
FileReader fr=new FileReader(f);
BufferedReader br=new BufferedReader(fr);
int abc=0;
System.out.println("Enter the startline");
Scanner s=new Scanner(System.in);
int m=s.nextInt();
System.out.println("Enter the endline");
int n=s.nextInt();

String st;
while((st=br.readLine()) != null)
{
	abc=abc+1;
	if ((abc>=m) && (abc<=n))
	{
		System.out.println(st);
	}
	}

}
}
