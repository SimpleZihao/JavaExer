// 代码体现1	
// 饿汉式（开发常用）
class Single
{
	// 2. 创建一个本类对象
	private static /*final*/ Single s = new Single();
	
	// 1.私有化构造函数
	private Single(){}
	
	// 3. 定义一个方法返回此对象. 赋予public权限
	public static Single getInstance()
	{
		return s;
	}
}
// 代码体现2  单例的延迟加载方式
// 懒汉式（面试常用）
class Single2
{
	private static Single2 s2 = null;
	
	private Single2(){}
	
	public static Single2() getInstance()
	{
		if(s2==null)
			s2 = new Single2();
		return s2;
	}
	
}

class SingleDemo
{
	public static void main(String[] args)
	{
		// 要想获取Single对象，调用getInstance方法。既然无法通过对象调用，只能用类名调用，所以此方法必须是static
		Single ss = Single.getInstance();
		Single ss2 = Single.getInstance();
		
		// 此种方法也可以调用s，但通过加入方法来获取是为了对对象可控
		// Single ss = Single.s;
		// Single ss2 = Single.s;
	}
}