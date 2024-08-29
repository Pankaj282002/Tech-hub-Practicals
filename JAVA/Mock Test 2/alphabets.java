class alphabets
{
	public static void main(String pankaj[])
	{
		for(int i=65; i<=90; i++)		// start point is 65 and ending point is 90 of ascci vlaues
		{
			if(i%2==0){		// if ascci value is even then print character.

				System.out.printf("%c\t", i);	// automatically type cast intiger into the character.
			}
		}
	}
}