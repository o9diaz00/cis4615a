/* Rule 04. Characters and Strings (STR)
 * STR03-J. Do not encode noncharacter data as a string
 * Non-Compliant Code:
 * BigInteger x = new BigInteger("530500452766");
 * byte[] byteArray = x.toByteArray();
 * String s = new String(byteArray);
 * byteArray = s.getBytes();
 * x = new BigInteger(byteArray);
*/

import java.math.BigInteger;

public class Main
{
	public static void main(String[] args)
	{
		BigInteger x = new BigInteger("530500452766");
		String s = x.toString();
		byte[] byteArray = s.getBytes();
		String ns = new String(byteArray);
		x = new BigInteger(ns);

		System.out.println("x: "+x);
	}
}
