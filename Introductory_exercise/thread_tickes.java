class Ticket implements Runnable
{
	// Ʊ������
	private int tickets=100;
	
	// ��Ʊ�������߳�ִ�С����̴߳��룬������run������
	// �߳̽ṹ��ͨ������ѭ���ṹ
	public void run()
	{
		while(true)
		{
			if(tickets>0)
			{
				//��ӡ�߳�����
				System.out.println(Thread.currentThread().getName()+"..."+tickets--);
			}
		}
	}
}

class ThreadDemo3
{
	public static void main(String[] args)
	{
		// ����Runnable�ӿڶ��������
		Ticket t = new Ticket();
		// �����ĸ��̶߳��󡣲���Runnable�ӿڵ����������Ϊ�������ݸ�Thread�Ĺ��캯��
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		// �����ĸ��߳�
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
