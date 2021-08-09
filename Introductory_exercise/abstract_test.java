/*
	���󣺹�˾�г���Ա�����������š�нˮ���������ݣ���Ŀ�����ڴ˻����϶��һ���
	������������ݽ�ģ
*/

abstract class Employee
{
	private String name;
	private String id;
	private double pay;
	// ����һ��Ա������һ��ʼ���;߱���������
	public Employee(String name, String id, double pay)
	{
		this.name=name;
		this.id=id;
		this.pay=pay;
	}
	
	// ������Ϊ
	public abstract void work();
	
}

// ��������ࣺ����Ա
class Programmer extends Employee
{
	Programmer(String name, String id, double pay)
	{
		super(name, id, pay);
	}
	public void work()
	{
		System.out.println("code...");
	}
}
// ��������ࣺ����

class Manage extends Employee
{	
	private double bonus;
	Manage(String name, String id, double pay, double bonus)
	{
		super(name, id, pay);
		this.bonus=bonus;
	}
	public void work()
	{
		System.out.println("manage...");
	}
}