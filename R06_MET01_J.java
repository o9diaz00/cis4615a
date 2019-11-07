/* Rule 06. Methods (MET)
 * MET01-J. Never use assertions to validate method arguments
*/

public class Main
{
	public static void main(String[] args)
	{ System.out.println("Get Abs Add of 10 and 5 = "+getAbsAdd(10,5)); }

	public static int getAbsAdd(int x, int y)
	{
		assert x != Integer.MIN_VALUE;
		assert y != Integer.MIN_VALUE;
		int absX = Math.abs(x);
		int absY = Math.abs(y);
		assert (absX <= Integer.MAX_VALUE - absY);
		return (absX + absY);
	}
}
