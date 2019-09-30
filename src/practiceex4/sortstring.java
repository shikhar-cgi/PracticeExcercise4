package practiceex4;

import java.util.Arrays;
import java.util.Scanner;

public class sortstring {
	
	public static void main(String []agrs )
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the text to be sorted");
		String s=myObj.nextLine().toLowerCase();
		
		String so=s.replaceAll("[,]","").replaceAll("[.]", "").replaceAll("[?]", "");
		String q[]=so.split(" ");
		Arrays.sort(q);
		System.out.println(Arrays.toString(q));
	}

}
