package stringmanipulations;



import java.io.*;
import java.util.Scanner;

class Consonants {

	
	static boolean isConsonant(char ch)
	{
		
		ch = Character.toUpperCase(ch);
	
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' ||
				ch == 'U') {
			 System.out.print(ch);
			return false;
		}else {
			System.out.print("*");
			return true;
		} 
	}

	static int totalConsonants(String str)
	{
		int count = 0;
		for (int i = 0; i < str.length(); i++)
	
		
			if (isConsonant(str.charAt(i)))
			{
				++count;
				
				
			}
		 System.out.println("");
		return count;
	}
	
	
	public static void main(String args[])
	{
		 Scanner in = new Scanner(System.in);
         System.out.print("Input a word: ");
         String str = in.nextLine();
 
         
		System.out.println( totalConsonants(str));
		
	}
}

