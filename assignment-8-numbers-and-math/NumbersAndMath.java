public class NumbersAndMath
{
	public static void main( String[] args )
	{
		System.out.println( "I will now count my chickens:" );
          // Count my chickens: plus and slash, minus and asterisk and percent
		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
		  // Count my chickens: plus and slash, minus and asterisk and percent
		System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4. ) );
         // Count my eggs
		System.out.println( "Now I will count the eggs:" );
         // Count my eggs
		System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );
         // Is it true that 3 + 2 < 5 - 7?
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
         //  3 + 2 < 5 - 7
		System.out.println( 3.0 + 2.0 < 5.0 - 7.0 );
         // What is 3 + 2?
		System.out.println( "What is 3 + 2? " + ( 3.0 + 2.0 ) );
		 // What is 5 - 7?
		System.out.println( "What is 5 - 7? " + ( 5.0 - 7.0 ) );
         // it's false
		System.out.println( "Oh, that's why it's false." );
         // some more
		System.out.println( "How about some more." );
         // Is it greater?
		System.out.println( "Is it greater? " + ( 5.0 > -2.0 ) );
		 // Is it greater or equal?
		System.out.println( "Is it greater or equal? " + ( 5.0 >= -2.0 ) );
		 // Is it less or equal?
		System.out.println( "Is it less or equal? " + ( 5.0 <= -2.0 ) );
	}
}