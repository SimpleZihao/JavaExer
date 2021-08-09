class Fu
{
	void show1()
	{
		System.out.println("Fu show1 run");
	}
}

class Zi extends Fu
{
	void show2()
	{
		System.out.println("zi show2 run");
	}
}

class ExtendsDemo1
{
	public static void main(String[] args)
	{
		Zi z = new Zi();
		z.show1();
		z.show2();
	}
}