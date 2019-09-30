package practiceex4;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher; 

public class matcherocc {

	public static void main(String []agrs )
	{
	Scanner myObj = new Scanner(System.in);
	System.out.println("Enter String");
	String s=myObj.nextLine();
	System.out.println("Give words to find");
	String q=myObj.nextLine();
	Pattern p=Pattern.compile(q);
    Matcher m=p.matcher(s);
    while(m.find())
    {
    	System.out.println("Found at: " + m.start()+"-" +m.end());
    }
}
}