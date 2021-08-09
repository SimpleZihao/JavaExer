class OverAdd
{
	public static void main(String[] args)
	{
		int result1 = add_num(3, 5);
		int result2 = add_num(5, 8, 10);
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
	}
	public static int add_num(int num1, int num2)
	{
		return num1+num2;
	}
	
	public static int add_num(int num1, int num2, int num3)
	{
		return num1+num2+num3;
	}
	
}