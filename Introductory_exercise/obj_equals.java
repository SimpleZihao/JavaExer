class Person extends Object
{
	private int age;
	Person(int age)
	{
		this.age=age;
	}
	// �ж��Ƿ���ͬ���ˣ��������Ҳ���ڱȽ�����person�����Ƿ����
	// ��ΪPerson��̳�Object,����������;߱���equals����
	// ����equals�����жϵ��ǵ�ַ��������������Ҫ�����ݣ���Ҫ��equals���з�����д
	public boolean equals(Object obj) 
	{
		//����Person�Լ����ж���ͬ�����ݣ��ж������Ƿ���ͬ
		// return this.age==obj.age; // ��������object��objectû�ж���age,���Ա���ʧ��
		
		//������ø÷����Ķ���ʹ��ݽ����Ķ�����ͬһ�����Ͳ���Ҫת�ͣ�ֱ�ӷ���true,���Ч��
		if(this==obj)
			return true;
		
		// age��Person���͵����ԣ���ȻҪ�õ������͵����ݣ���Ҫ����ת��
		if(!(obj instanceof Person))
			throw new ClassCastException("���ʹ��������");
		Person p = (Person)obj;
		
		return this.age==p.age;
		
	}
	
}

class ObjectDemo
{
	public static void main(String[] args)
	{
		Person p1 = new Person(12);
		Person p2 = new Person(15);
		System.out.println(p1.equals(p2));
	}
	
}