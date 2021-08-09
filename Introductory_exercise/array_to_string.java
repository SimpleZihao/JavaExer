// 需求：定义功能：将{34，12，67}数组中的元素转为字符串“[34,12,67]”

class ArrToStr
{
	public static void main(String[] args)
	{
		int[] arr = {34,12,67};
		String result = toString(arr);
		System.out.println(result);
	}
	
	public static String toString(int[] arr)
	{
		String tmp = "[";
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]!=arr[arr.length-1])
				{
					tmp += arr[i]+",";
				}
				else
					tmp += arr[i]+"]";
		}
		return tmp;
	}
}
	