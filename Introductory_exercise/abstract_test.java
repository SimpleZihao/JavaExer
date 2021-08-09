/*
	需求：公司中程序员有姓名、工号、薪水、工作内容，项目经理在此基础上多出一项奖金
	对需求进行数据建模
*/

abstract class Employee
{
	private String name;
	private String id;
	private double pay;
	// 构造一个员工对象，一初始化就具备三个属性
	public Employee(String name, String id, double pay)
	{
		this.name=name;
		this.id=id;
		this.pay=pay;
	}
	
	// 工作行为
	public abstract void work();
	
}

// 具体的子类：程序员
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
// 具体的子类：经理

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