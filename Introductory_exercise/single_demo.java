// ��������1	
// ����ʽ���������ã�
class Single
{
	// 2. ����һ���������
	private static /*final*/ Single s = new Single();
	
	// 1.˽�л����캯��
	private Single(){}
	
	// 3. ����һ���������ش˶���. ����publicȨ��
	public static Single getInstance()
	{
		return s;
	}
}
// ��������2  �������ӳټ��ط�ʽ
// ����ʽ�����Գ��ã�
class Single2
{
	private static Single2 s2 = null;
	
	private Single2(){}
	
	public static Single2() getInstance()
	{
		if(s2==null)
			s2 = new Single2();
		return s2;
	}
	
}

class SingleDemo
{
	public static void main(String[] args)
	{
		// Ҫ���ȡSingle���󣬵���getInstance��������Ȼ�޷�ͨ��������ã�ֻ�����������ã����Դ˷���������static
		Single ss = Single.getInstance();
		Single ss2 = Single.getInstance();
		
		// ���ַ���Ҳ���Ե���s����ͨ�����뷽������ȡ��Ϊ�˶Զ���ɿ�
		// Single ss = Single.s;
		// Single ss2 = Single.s;
	}
}