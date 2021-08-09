// ����ģʽӦ��---��������
// ���˶���Ӧ����Ψһ�ģ���֤supermanΨһ��
class SuperMan
{
	private String name;
	private static SuperMan man = new SuperMan("������");
	private SuperMan(String name)
	{
		this.name=name;
	}
	// ����SuperMan���͵Ķ���
	public static SuperMan getInstance()
	{
		return man;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void fly()
	{
		System.out.println(this.name+"...fly");
	}
	
}

class SingleTest
{
	public static void main(String[] args)
	{
		
		SuperMan man1 = SuperMan.getInstance();
		SuperMan man2 = SuperMan.getInstance();
		man1.setName("hero");
		System.out.println("\n");
		man2.fly();
	}
}