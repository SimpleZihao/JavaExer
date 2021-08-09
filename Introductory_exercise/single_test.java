// 单例模式应用---描述超人
// 超人对象应该是唯一的，保证superman唯一性
class SuperMan
{
	private String name;
	private static SuperMan man = new SuperMan("克拉克");
	private SuperMan(String name)
	{
		this.name=name;
	}
	// 返回SuperMan类型的对象
	public static SuperMan getInstance()
	{
		return man;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void fly()
	{
		System.out.println(this.name+"...fly");
	}
	
}

class SingleTest
{
	public static void main(String[] args)
	{
		
		SuperMan man1 = SuperMan.getInstance();
		SuperMan man2 = SuperMan.getInstance();
		man1.setName("hero");
		System.out.println("\n");
		man2.fly();
	}
}