class Demo extends Thread
{
	private String name;
	Demo(String name)
	{
		this.name = name;
	}
	public void run()
	{
		for(int x=1; x<20; x++)
		{
			System.out.println("name="+name+"..."+x);
		}
	}
	
}
class ThreadDemo
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo("小强");
		Demo d2 = new Demo("旺财");
		d2.start(); //开启d2线程
		d1.run(); // 主线程负责
	}
}