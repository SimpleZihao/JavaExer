// ��̬�����

class Demo
{
	static int x=9; // ��̬���������γ�ʼ����һ��Ĭ�ϳ�ʼ����һ����ʾ��ʼ��
	static	// ��̬����顣�ھ�̬������ʽ��ʼ���Ժ���ִ��
	{
		System.out.println("����ؾ�ִ�еĲ��֣�"+x);
	}
	static void show()
	{
		System.out.println("Show run");
	}
}

class StaticCodeDemo
{
	public static void main(String[] args)
	{
		Demo.show();
		Demo.show();
	}
}