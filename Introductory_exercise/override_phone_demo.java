class Phone
{
	// ��绰
	void call(){}
	// ������ʾ
	void show()
	{
		System.out.println("�绰����");
	}
}

class NewPhone extends Phone
{
	void show()
	{
		super.show(); // �������Ҫ������ԭ�еĲ��ֹ��ܣ�����ͨ��super����
		System.out.println("����");
		System.out.println("ͷ��");
	}
}

class OverridePhone
{
	public static void main(String[] args)
	{
		NewPhone np = new NewPhone();
		np.show();
	}
}