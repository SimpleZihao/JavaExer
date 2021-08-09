class Person
{
	private String name;
	private int age;
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	
}

class Student extends Person
{
	public Student(String name, int age)
	{
		super(name, age);
	}
	public void study()
	{
		System.out.println("study...");
	}
}
class Worker extends Person
{
	public Worker(String name, int age)
	{
		// 调用父类。使用父类的初始化动作
		super(name, age);
	}
}

class SuperApp
{
	public static void main(String[] args)
	{
		new Student("张三", 18);
	}
}