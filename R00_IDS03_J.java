/* Rule 00. Input Validation and Data Sanitization (IDS)
 * IDS03-J. Do not log unsanitiized user input
 * Non-Compliant Code:
 * if (loginSuccessful)
 * { logger.severe("User login succeeded for: "+username); }
 * else
 * { logger.severe("User login failed for: "+username); }
*/

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main
{
        public static void main(String[] args)
        {
                System.out.println("Enter input: ");
                Scanner keyboard = new Scanner(System.in);
                String input = keyboard.nextLine();
                keyboard.close();
                if (input.equals("student"))
                { System.out.println("User login succeeded for: "+sanitizeUser(input)); }
                else
                { System.out.println("User login failed for: "+sanitizeUser(input)); }
        }

        public static String sanitizeUser(String username)
        { return (Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user"); }
}

