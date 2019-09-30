package practiceex4;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher; 

public class Presence {

	public static void main(String []agrs )
	{
	Scanner myObj = new Scanner(System.in);
	System.out.println("Enter the string");
	String s=myObj.nextLine();
	Pattern harry=Pattern.compile("Harry");
    Matcher m=harry.matcher(s);
    if(m.find())
    {
    	System.out.println("Is Harry here ? true");
    }
    else
    {
    	System.out.println("Is Harry here ? false");
    }
}
}