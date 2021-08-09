class Demo implements Runnable
{
	private String name;
	Demo(String name)
	{
		this.name=name;
	}
	
	// ���ǽӿ�Runnable�е�run����
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
		// ����Thread��Ķ����������̶߳���
		Demo d = new Demo("Demo");
		// ����Thread��Ķ��󣬽�Runnable�ӿڵ����������Ϊ�������ݸ�Thread��
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		//�����߳�
		t1.start();
		t2.start();
	}
}