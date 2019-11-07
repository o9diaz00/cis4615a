/* Rule 03. Numeric Types and Operations (NUM)
 * NUM07-J. Do not attempt comparisons with NaN
 * Non-Compliant Code:
 * double x = 0.0;
 * double result = Math.cos(1/x);
 * if (result == Double.NaN)
 * { System.out.println("result is NaN"); }
*/

public class Main
{
	public static void main(String args[])
	{
		double x = 0.0;
		double result = Math.cos(1/x);
		if (Double.isNaN(result))
		{ System.out.println("result is NaN"); }
	}
}
