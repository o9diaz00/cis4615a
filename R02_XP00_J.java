/* Rule 02. Expressions (EXP)
 * XP00-J. Do not ignore values returned by methods
 * Non-Compliant Code:
 * public void deleteFile() {
 * 	File someFile = new File("someFileName.txt");
 *	// Do something with someFile
 *	someFile.delete();
 *	}
*/

import java.io.File;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		File f = new File("newFile.txt");
		Scanner keyboard = new Scanner(System.in);
		int input = 0;
		while (input != 1)
		{
			System.out.println("What do you want to do with the file ["+f.getName()+"]?");
			System.out.println("1)Delete\n*)Nothing");
			input = keyboard.nextInt();
		}
		keyboard.close();
		if (!f.delete())
		{ System.out.println("Deletion of file ["+f.getName()+"] failed!"); }
	}
}
