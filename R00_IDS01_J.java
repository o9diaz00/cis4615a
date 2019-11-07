/* Rule 00. Input Validation and Data Sanitization (IDS)
 * IDS01-J. Normalize strings before validating them
*/

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
	public static void main(String[] args)
	{
		String s = "\uFE64" + "script" + "\uFE65";
		Pattern pattern = Pattern.compile("[<>]");
		Matcher matcher = pattern.matcher(s);
		if (matcher.find())
		{ throw new IllegalStateException(); }
		else
		{ /* ...*/ }
		s = Normalizer.normalize(s, Form.NFKC);
	}
}
