import java.util.Scanner;

public class CaesarCipher
{
	/**
	* Returns the character shifted by the given number of letters.
	*/

	public static char shiftLetter( char c, int n )
	{
		int ch = c;

		if ( ! Character.isLetter(c) )
		{
			return c;
		}

		ch = ch + n;

		if ( Character.isUpperCase(c) && ch > 'Z' || Character.isLowerCase(c) && ch > 'z' )
			ch -= 26;
		if ( Character.isUpperCase(c) && ch < 'A' || Character.isLowerCase(c) && ch < 'a' )
			ch += 26;

		return (char)ch;
	}

	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String plaintext, cipher = "";
		int shift;

		System.out.print("Message: ");
		plaintext = keyboard.nextLine();
		System.out.print("Shift (0-26): " );
		shift = keyboard.nextInt();

		for ( int i = 0; i < plaintext.length(); i++ )
		{
			cipher += shiftLetter( plaintext.charAt(i), shift );
		}
		System.out.println( cipher );
	}
}