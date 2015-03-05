public class ArraySlotAccess
{
	public static void main( String[] args )
	{
		int[] arr = new int[3];
		int i;

		arr[0] = 0;
		arr[1] = 0;
		arr[2] = 0;

		System.out.println("Array contains: " + arr[0] + " " + arr[1] + " " + arr[2] );

		// Fill each slot of this array with a ranbom number 1-100
		arr[0] = 1 + (int)(Math.random()*100);
		arr[1] = 1 + (int)(Math.random()*100);
		arr[2] = 1 + (int)(Math.random()*100);

		// Display them again.
		System.out.println("Array contains: " + arr[0] + " " + arr[1] + " " + arr[2] );

		// This is a bit silly, but try to understand it. 
		i = 0;
		arr[i] = 1 + (int)(Math.random()*100);
		i = 1;
		arr[i] = 1 + (int)(Math.random()*100);
		i = 2;
		arr[i] = 1 + (int)(Math.random()*100);

		// Display them again.
		System.out.print("Array contains: " );
		i = 0;
		System.out.print(arr[i] + " ");
		i = 1;
		System.out.print(arr[i] + " ");
		i = 2;
		System.out.print(arr[i] + " " );

		System.out.println();

		// This is even more silly but it works. Can you guess where this is headed?

		i = 0;
		arr[i] = 1 + (int)(Math.random()*100);
		i++;
		arr[i] = 1 + (int)(Math.random()*100);
		i++;
		arr[i] = 1 + (int)(Math.random()*100);
		i++;

		// Display them again. 
		System.out.print("Array contains: " );
		i = 0;
		System.out.print(arr[i] + " ");
		i++;
		System.out.print(arr[i] + " " );
		i++;
		System.out.print(arr[i] + " " );
		i++;
		System.out.println();

		// Ah! Let's just use a regualr 'for' loop!
		for ( i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}