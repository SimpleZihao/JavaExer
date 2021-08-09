class Person extends Object
{
	private int age;
	Person(int age)
	{
		this.age=age;
	}
	// 判断是否是同龄人，这个方法也是在比较两个person对象是否相等
	// 因为Person类继承Object,所以它本身就具备着equals方法
	// 但是equals方法判断的是地址，不是我们所需要的内容，需要对equals进行方法重写
	public boolean equals(Object obj) 
	{
		//建立Person自己的判断相同的依据，判断年龄是否相同
		// return this.age==obj.age; // 所属类型object，object没有定义age,所以编译失败
		
		//如果调用该方法的对象和传递进来的对象是同一个，就不需要转型，直接返回true,提高效率
		if(this==obj)
			return true;
		
		// age是Person类型的属性，既然要用到子类型的内容，需要向下转型
		if(!(obj instanceof Person))
			throw new ClassCastException("类型错误！请改正");
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