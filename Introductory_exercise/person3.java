class ConsPerson
{
	private String name;
	private int age;
	
	// ���幹�캯��(������)������һ�����;߱�����
	ConsPerson(String n)
	{
		// �����յ���ֵ��ֵ�������name
		name = n;
	}
	
	public void speak()
	{
		System.out.println("name="+name+",age="+age);
	}
}

class PersonDemo03
{
	public static void main(String[] args)
	{
		// ���󴴽�ʱ������ö�Ӧ�Ĺ��캯������Ϊ������Ҫ��ʼ��
		ConsPerson p = new ConsPerson("����");
		p.speak();
	}
}