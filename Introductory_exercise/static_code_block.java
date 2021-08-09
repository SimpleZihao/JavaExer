// 静态代码块

class Demo
{
	static int x=9; // 静态变量有两次初始化，一次默认初始化，一次显示初始化
	static	// 静态代码块。在静态变量显式初始化以后再执行
	{
		System.out.println("类加载就执行的部分："+x);
	}
	static void show()
	{
		System.out.println("Show run");
	}
}

class StaticCodeDemo
{
	public static void main(String[] args)
	{
		Demo.show();
		Demo.show();
	}
}