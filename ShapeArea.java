import java.util.Scanner;

public class ShapeArea
{
	public static void main( String[] args )
	{

		Scanner keyboard = new Scanner(System.in);

		int choice;
		double area = 0;

		System.out.println("Shape Area Calculator version 0.1 (c) 2013 Mitchell Sample Output, Inc.");

		do
		{
			System.out.println("\n-=-=-==-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
			System.out.println("1) Triangle");
			System.out.println("2) Circle");
			System.out.println("3) Rectangle");
			System.out.println("4) Quit");
			System.out.println("> ");
			choice = keyboard.nextInt();

			if ( choice == 1 )
			{
				System.out.print("\nBase: ");
				int b = keyboard.nextInt();
				System.out.print("Height: ");
				int h = keyboard.nextInt();
				area = computeTriangleArea(b, h);
				System.out.println("The area is " + area);
			}
			else if ( choice == 2)
			{
				System.out.print("\nRadius: ");
				int r = keyboard.nextInt();
				area = computeCircleArea(r);
				System.out.println("The area is " + area);

			}
			else if ( choice == 3 )
			{
				System.out.print("\nLength: " );
				int length = keyboard.nextInt();
				System.out.print("Width: " );
				int width = keyboard.nextInt();
				System.out.println("The area is " + computeRectangleArea(length, width) );
			}
			else if ( choice != 4 )
			{
				System.out.println("ERROR.");
			}
		} while (choice !=4 );
	}

		public static double computeTriangleArea( int base, int height )
		{
			double A;
			A = 0.5 * base * height;
			return A;
		}

		public static double computeCircleArea( int radius )
		{
			double A;
			A = Math.PI * radius * radius;
			return A;
		}

		public static int computeRectangleArea( int length, int width )
		{
			return (length * width);
		}
}