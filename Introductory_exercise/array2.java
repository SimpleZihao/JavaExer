class Arr2
{
	public static void main(String[] args)
	{
		int[][] arr = new int[3][2];
		System.out.println("��ά�����ʵ����:"+arr);
		System.out.println("һά�����ʵ����:"+arr[0]);
		System.out.println("һά������Ԫ�ص�ʵ����:"+arr[0][0]);
		
		System.out.println("------��ά������һ�ֶ��巽ʽ�����------");
		int[][] arr1 =  {{21,22,34},{35,56,75},{87,86,98}};
		int sum = 0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				sum += arr1[i][j];
			}
		}
		System.out.println("��ά����ĺ��ǣ�"+sum);
	}
	
}