/* Rule 00. Input Validation and Data Sanitization (IDS)
 * IDS03-J. Do not log unsanitiized user input
*/

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main
{
        public static void main(String[] args)
        {
		if (loginSuccessful)
		{ logger.severe("User login succeeded for: "+username); }
		else
		{ logger.severe("User login failed for: "+username); }
        }
}

