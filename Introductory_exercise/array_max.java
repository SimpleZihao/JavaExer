class ArrayMax
{
	public static void main(String[] args)
	{
		int[] arr = {3,9,7,1,5};
		int max = get_max(arr);
		System.out.println("Max:"+max);
	}
	
	public static int get_max(int[] arr)
	{
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
}