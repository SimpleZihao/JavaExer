class Demo implements Runnable
{
	private String name;
	Demo(String name)
	{
		this.name=name;
	}
	
	// 覆盖接口Runnable中的run方法
	public void run()
	{
		for(int x=1;x<=20;x++)
		{
			System.out.println("name="+Thread.currentThread().getName()+"..."+x);
		}
	}
}

class ThreadDemo01
{
	public static void main(String[] args)
	{
		// 创建Thread类的对象（它不是线程对象）
		Demo d = new Demo("Demo");
		// 创建Thread类的对象，将Runnable接口的子类对象作为参数传递给Thread类
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		//启动线程
		t1.start();
		t2.start();
	}
}