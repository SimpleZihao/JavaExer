class ConsPerson
{
	private String name;
	private int age;
	
	// 定义构造函数(构造器)，对象一创建就具备姓名
	ConsPerson(String n)
	{
		// 将接收到的值赋值给对象的name
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
		// 对象创建时，会调用对应的构造函数，因为对象需要初始化
		ConsPerson p = new ConsPerson("张三");
		p.speak();
	}
}