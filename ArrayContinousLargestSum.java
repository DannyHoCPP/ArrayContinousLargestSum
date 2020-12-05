public class ArrayContinousLargestSum 
{
	public static int largestSequence(int[] array)
	{
	
		if(array == null || array.length < 1)
		{
			return 0;
		}
		
		int current = array[0];
		int max = array[0];
		
		for (int i: array)
		{
			if(current < 0)
			{
				current = i;
			}
			else
			{
				current += i;
			}
			
			if(max < current)
			{
				max = current;
			}
		}
		return max;
	}
	
	public static void main(String[] args)
    {
		int[] array = new int[]{2, -8, 3, -2, 4, -10};
		System.out.println("Largest sum is: " + largestSequence(array));
		
		int[] array2 = new int[]{-99, -2, -23, -8, -3, -2, -4, -10, -1, -29};
		System.out.println("Largest sum is: " + largestSequence(array2));
		
		int[] array3 = new int[]{-99, 2, -23, 8, 3, -2, 4, -10, -1, 29};
		System.out.println("Largest sum is: " + largestSequence(array3));
		
		int[] array4 = new int[] {};
		System.out.println("Largest sum is: " + largestSequence(array4));
    }
	
}
