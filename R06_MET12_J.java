/* Rule06. Methods (MET)
 * MET12-J. Do not use finalizers
*/

import javax.swing.JFrame;

public class Main extends JFrame
{
	private byte[] buffer = new byte[16 * 1024 * 1024];
	// Persists for at least two GC cycles

	public static void main(String[] args)
	{ System.out.println("non-compliant code"); }
}
