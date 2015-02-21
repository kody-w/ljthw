public class YachtDiceNoFunctions 
{
	public static void main( String[] args )
	{
		int roll1, roll2;

		do
		{
			roll1 = 1 + (int)(Math.random()*6);
			roll2 = 1 + (int)(Math.random()*6);
			int total = roll1 + roll2;

			System.out.println("\nYou rolled a " + roll1 + " and a " + roll2);
			System.out.println("+---+");
			if ( roll1 == 1 )
			{
				System.out.println("|   |");
				System.out.println("| o |");
				System.out.println("|   |");
			}
			else if ( roll1 == 2 )
			{
				System.out.println("|o  |");
				System.out.println("|   |");
				System.out.println("|  o|");
			}
			else if ( roll1 == 3 )
			{
				System.out.println("|o  |");
				System.out.println("| o |");
				System.out.println("|  o|");
			}
			else if ( roll1 == 4 )
			{
				System.out.println("|o o|");
				System.out.println("|   |");
				System.out.println("|o o|");
			}
			else if ( roll1 == 5 )
			{
				System.out.println("|o o|");
				System.out.println("| o |");
				System.out.println("|o o|");
			}
			else if ( roll1 == 6 )
			{
				System.out.println("|o o|");
				System.out.println("|o o|");
				System.out.println("|o o|");
			}
			System.out.println("+---+");

			System.out.println("+---+");
			if ( roll2 == 1 )
			{
				System.out.println("|   |");
				System.out.println("| o |");
				System.out.println("|   |");
			}
			else if ( roll2 == 2 )
			{
				System.out.println("|o  |");
				System.out.println("|   |");
				System.out.println("|  o|");
			}
			else if ( roll2 == 3 ) 
			{
				System.out.println("|o  |");
				System.out.println("| o |");
				System.out.println("|  o|");

			}
			else if ( roll2 == 4 )
			{
				System.out.println("|o o|");
				System.out.println("|   |");
				System.out.println("|o o|");

			}
			else if ( roll2 == 5 )
			{
				System.out.println("|o o|");
				System.out.println("| o |");
				System.out.println("|o o|");
			}
			else if ( roll2 == 6 )
			{
				System.out.println("|o o|");
				System.out.println("|o o|");
				System.out.println("|o o|");

			}
			System.out.println("+---+");

			System.out.println("The total is " + total + "\n" );

			} while ( roll1 != roll2 );

			System.out.println("Doubles! Nice job.");
	}
}