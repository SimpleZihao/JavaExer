class Arr2
{
	public static void main(String[] args)
	{
		int[][] arr = new int[3][2];
		System.out.println("二维数组的实体是:"+arr);
		System.out.println("一维数组的实体是:"+arr[0]);
		System.out.println("一维数组中元素的实体是:"+arr[0][0]);
		
		System.out.println("------二维数组另一种定义方式并求和------");
		int[][] arr1 =  {{21,22,34},{35,56,75},{87,86,98}};
		int sum = 0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				sum += arr1[i][j];
			}
		}
		System.out.println("二维数组的和是："+sum);
	}
	
}