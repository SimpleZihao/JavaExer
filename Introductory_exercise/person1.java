class Person
{
	int age;
	void speak()
	{
		System.out.println("age="+age);
	}
}

class PersonDemo01
{
	public static void main(String[] args)
	{
		Person p = new Person();
		p.age=20;
		p.speak();
	}
	
}