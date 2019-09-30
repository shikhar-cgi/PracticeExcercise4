package practiceex4;

import java.util.Scanner;

public class stringreverse {
	
	public static void main(String []agrs)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter the string");
		String s=myObj.nextLine();
		String q[]=s.split(" ");
		for(int i=0;i<q.length;i++)
		{
		   StringBuilder sr=new StringBuilder();
		   sr.append(q[i]);
		   sr=sr.reverse();
		   q[i]=sr.toString();
		}
		for(int i=0;i<q.length;i++)
		{
			System.out.print( q[i] + " ");
		}
	}

}
