class Fu
{
	Fu()
	{	// œ‘ æ≥ı ºªØ
		System.out.println("fu constructor run A");
	}
	Fu(int x)
	{
		System.out.println("run constructor run B..."+x);
	}
}

class Zi extends Fu
{
	Zi()
	{
		System.out.println("zi constructor run C...");
	}
	Zi(int x)
	{
		System.out.println("zi constructor run D..."+x);
	}
}

class ExtendsDemo
{
	public static void main(String[] args)
	{
		new Zi();
		new Zi(6);
	}
}