class Ticket implements Runnable
{
	// 票的数量
	private int tickets=100;
	
	// 售票，被多线程执行。多线程代码，定义在run方法中
	// 线程结构中通常都有循环结构
	public void run()
	{
		while(true)
		{
			if(tickets>0)
			{
				//打印线程名称
				System.out.println(Thread.currentThread().getName()+"..."+tickets--);
			}
		}
	}
}

class ThreadDemo3
{
	public static void main(String[] args)
	{
		// 创建Runnable接口对子类对象
		Ticket t = new Ticket();
		// 创建四个线程对象。并将Runnable接口的子类对象作为参数传递给Thread的构造函数
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		// 开启四个线程
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
