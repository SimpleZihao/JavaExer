class Phone
{
	// 打电话
	void call(){}
	// 来电显示
	void show()
	{
		System.out.println("电话号码");
	}
}

class NewPhone extends Phone
{
	void show()
	{
		super.show(); // 如果还需要父类中原有的部分功能，可以通过super调用
		System.out.println("姓名");
		System.out.println("头像");
	}
}

class OverridePhone
{
	public static void main(String[] args)
	{
		NewPhone np = new NewPhone();
		np.show();
	}
}