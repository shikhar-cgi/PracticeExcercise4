package practiceex4;

import java.util.Scanner;

public class occurence {
	
	public static void main(String []agrs )
	{
	Scanner myObj = new Scanner(System.in);
	System.out.println("Enter the String");
	String s=myObj.nextLine();
	int len=s.length();
	System.out.println("Enter the character to find its occurence");
	String q=myObj.nextLine();
	String e=s.replaceAll("a", "");
	int leng=e.length();
	int y=len-leng;
	System.out.println("Occurence of " + q + " in " + s + " is " + y );
	}
}
