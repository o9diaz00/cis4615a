/* Rule06. Methods (MET)
 * MET12-J. Do not use finalizers
 * Non-Compliant Code:
 * class MyFrame extends JFrame {
 * 	private byte[] buffer = new byte[16 * 1024 * 1024];
 * 	// Persists for at least two GC cycles
 * }
*/

import javax.swing.JFrame;

public class Main
{
	private JFrame frame;
	private byte buffer[] = new byte[16 * 1024 * 1024]; // Now decoupled

	public static void main(String[] args)
	{ System.out.println("R06_MET12_J.java compiles and executes"); }
}
