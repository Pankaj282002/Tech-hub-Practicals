class FindSecondMax 
{
	private int[] values;
	public void setValue(int... x) 
	{
        		this.values = x;
    	}
    	public int getSecondMax() 
	{
        		int max = 0;
        		int secondMax = 0;
        		for (int i = 0; i < values.length; i++) 
		{
            			if (values[i] > max)
			{
                				secondMax = max;
                				max = values[i];
            			} 
			else if (values[i] > secondMax && values[i] != max) 
			{
                				secondMax = values[i];
            			}
        		}
        		return secondMax;
 	}
}
public class FindSecondMaxApp
{
	public static void main(String pankaj[] ) 
	{
        		FindSecondMax f = new FindSecondMax();
        		f.setValue(10, 5, 20, 8, 15);
        		int secondMax = f.getSecondMax();
        		System.out.println("Second Maximum Value: " + secondMax);
    	}
}