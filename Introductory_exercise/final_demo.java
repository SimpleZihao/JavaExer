/*final*/ class Fu
{
	/*final*/ void show()
	{
		
	}
}

class Zi extends Fu
{
	// 重写
	void show()
	{
		final int count=21;
		System.out.println("xxx。。。"+count);
	}
}