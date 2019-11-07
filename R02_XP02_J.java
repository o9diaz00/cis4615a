/* Rule 02. Expressions (EXP)
 * EXP02-J. Do not use the Object.equals() methods to compare two arrays
*/

import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
	{
		int[] arr1 = new int[20];
		int[] arr2 = new int[20];
		System.out.println(arr1.equals(arr2));
	}
}
