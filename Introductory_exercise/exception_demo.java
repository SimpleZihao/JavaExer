class Demo
{
	// 对给定的数组通过给定的角标获取元素
	int getElement(int[] arr, int index)
	{
		if(arr==null)
		{
			throw new NullPointerException("arr指向的数组不存在");
		}
		
		if(index<0 || index>=arr.length)
		{
			// 1. 创建一个异常对象，封装一些提示信息（自定义）
			// 2.需要将这个对象告知给调用者，通过throw关键字完成。 throw 异常对象;
			// 3. throw用在函数内，抛出异常对象，并可以结束函数
			throw new ArrayIndexOutOfBoundsException("错误的角标，"+index+"索引在数组中不存在");
		}
		
		int element = arr[index];
		return element;
	}
}

class ExceptionDemo
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		int[] arr = {34, 12, 67};
		int num = d.getElement(arr, 2);
		System.out.println("num"+num);
		System.out.println("over");
	}
}