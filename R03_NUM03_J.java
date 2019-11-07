/* Rule 03. Numeric Types and Operations (NUM)
 * NUM03-J. Use integer types that can fully represent the possible range of unsigned data
*/

import java.io.DataInputStream;
import java.io.IOException;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Type and/or keep pressing enter until you see it...");
		try
		{ System.out.println(getInteger(new DataInputStream(System.in))); }
		catch (IOException e)
		{ e.printStackTrace(); }
	}

	public static long getInteger(DataInputStream is) throws IOException
	{ return (is.readInt()); }
}
