package stringmanipulations;

import java.util.*;
import java.io.*;

class RotateString
{
		
	
	static String rotate(String str, int d)
	{
			String newStr = str.substring(d) + str.substring(0, d);
			return newStr;
	}



	
	public static void main(String args[])
	{
			String str1 = "techbeeSolutions";
			System.out.println(rotate(str1, 2));

			
	}
}



