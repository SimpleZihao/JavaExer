class Outer // �ⲿ��
{
	private int num=6;
	
	class Inner // �ڲ���
	{
		void show()
		{
			System.out.println("num+"+num);
		}
	}
	
	void method()
	{
		Inner in = new Inner();
		in.show();
	}
	
}

class InnerClassDemo
{
	public static void main(String[] args)
	{
		Outer out = new Outer();
		out.method();
	}
}