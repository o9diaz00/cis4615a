/* Rule 04. Character and Strings (STR)
 * STR01-J. Do not assume that a Java char fully represents a Unicode point
 */

public class Main
{
	public static void main(String args[])
	{ System.out.println(trim("This class is CIS4615a")); }

	public static String trim(String string)
	{
		int ch, i;
		for (i=0; i<string.length(); i+=1)
		{
			ch = string.charAt(i);
			if (!Character.isLetter(ch))
			{ break; }
		}
		return string.substring(i);
	}
}
