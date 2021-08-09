// 描述银行
class Bank
{
	private int sum;
	private Object obj = new Object();
	public void add(int num)
	{	
		synchronized(obj)
		{
		sum = sum+num;
		System.out.println("sum="+sum);//每村一次，打印金额的变化
		}
	}
}

class Customer implements Runnable
{
	private Bank b = new Bank();
	public void run()
	{
		for(int x=0;x<3;x++)
		{
			b.add(100); //一次存100
		}
	}
}
class ThreadDemo3
{
	public static void main(String[] args)
	{
		Customer c = new Customer();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}