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
		Demo d1 = new Demo("Сǿ");
		Demo d2 = new Demo("����");
		d2.start(); //����d2�߳�
		d1.run(); // ���̸߳���
	}
}