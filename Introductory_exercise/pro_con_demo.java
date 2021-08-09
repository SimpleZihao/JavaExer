class BoundedBuffer
{
	final Lock lock = new ReentrantLock(); //��
	final Condition notFull = lock.newCondition(); //����
	final Condition notEmpty = lock.newCondition(); //����
	
	final Object[] items = new Object[100]; //�洢��Ʒ������
	int putptr /*������ʹ�õĽǱ�*/, takeptr/*������ʹ�õĽǱ�*/, count/*������*/;
	
	//������ʹ�õķ������������д洢��Ʒ
	public void put(Object x) throws InterruptedException
	{
		lock.lock();
		try
		{
			while(count==items.length)// �жϼ������Ƿ��ѵ����鳤�ȣ��Ƿ�������
				notFull.await(); //�����������ߵȴ�
			items[putptr] = x; //���սǱ꽫��Ʒ�洢��������
			if(++putptr == items.length)//����洢�ĽǱ굽������ĳ��ȣ��ͽ��Ǳ����
				putptr = 0;
			++count; //����������
			notEmpty.signal();//����һ��������
		}
		final
		{
			lock.unlock();
		}
	}
	
	public Object take() throws InterruptedException
	{
		lock.lock();
		try
		{
			while(count==0)//���������Ϊ0��˵��û����Ʒ�������ߵȴ�
				notEmpty.await();
			Object x = items[takeptr];//��������ͨ�������߽Ǳ��ȡ��Ʒ
			
			if(++takeptr == items.length) //������ѵĽǱ����������ĳ��ȣ����Ǳ����
				takeptr = 0;
			--count; //�������Լ�
			notFull.signal(); //����������
			return x;
		}
		final
		{
			lock.unlock();
		}
	}
}