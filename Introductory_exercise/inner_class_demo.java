class Outer // 外部类
{
	private int num=6;
	
	class Inner // 内部类
	{
		void show()
		{
			System.out.println("num+"+num);
		}
	}
	
	void method()
	{
		Inner in = new Inner();
		in.show();
	}
	
}

class InnerClassDemo
{
	public static void main(String[] args)
	{
		Outer out = new Outer();
		out.method();
	}
}