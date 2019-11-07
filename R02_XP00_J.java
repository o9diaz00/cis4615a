/* Rule 02. Expressions (EXP)
 * XP00-J. Do not ignore values returned by methods
*/

import java.io.File;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		File someFile = new File("someFileName.txt");
		// Do something with someFile
		someFile.delete();
	}
}
