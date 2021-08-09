class Person2
{
	private int age;
	
	void setAge(int a)
	{
		if (a>0 && a<130)
		{
			age=a;
		}
		else
			System.out.println("error age!");
	}
	int getAge()
	{
		return age;
	}
	
}

class PersonDemo02
{
	public static void main(String[] args)
	{
		Person2 p = new Person2();
		p.setAge(-20);
		int result = p.getAge();
		System.out.println("age:"+result);
	}
}