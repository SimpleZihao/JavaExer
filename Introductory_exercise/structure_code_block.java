
class Demo
{
	{
		System.out.println("code run");
		System.out.println("I am universal code");
		
	}
	
	Demo()
	{
		System.out.println("demo1 run");
	}
	
	Demo(int x)
	{
		System.out.println("demo2 run..."+x);
	}
	
}

class ConstructorCodeDemo
{
	public static void main(String[] args)
	{
		new Demo();
		new Demo(5);
		
		{
			//局部代码块，作用：可以控制局部变量的生命周期
			int x=5;
			System.out.println("局部代码块："+x);
		}
		System.out.println("Over...");
	}
}