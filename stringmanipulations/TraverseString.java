package stringmanipulations;

public class TraverseString {
	


	public static void main(String[] args)
	{
		String str = "techbeesolutions";
		

		for (int i = 0; i < str.length(); i++)
		{
			
			boolean isUnique = false;
			for (int j = 0; j < str.length(); j++)
			{
				// checking if two characters are equal
				if (str.charAt(i) == str.charAt(j) && i != j)
				{
					isUnique = true;
				
					break;
				}
				
			}
			
			if (isUnique == false)
				System.out.print(str.charAt(i));
		}
	}
	}


