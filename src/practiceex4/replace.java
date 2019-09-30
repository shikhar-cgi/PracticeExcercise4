package practiceex4;

import java.util.Scanner;

public class replace {
	public static void main(String []agrs )
	{
	Scanner myObj = new Scanner(System.in);
	System.out.print("Enter the string");
	String s=myObj.nextLine();
    String q=s.replace("d","f");
    String h=q.replace("l","t");
    System.out.println("replce string is: " + h);
	}
}
