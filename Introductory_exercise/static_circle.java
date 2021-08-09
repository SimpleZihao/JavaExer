class Circle
{
		private double radius; //圆半径
		// 每个 圆对象中都存储一份，浪费空间。实现对象共享，加入static静态关键字
		private static double pi=3.14;	
		// 构造函数
		Circle(double radius)
		{
			this.radius=radius;
		}
		
		double circle_area()
		{
			return radius*radius*pi;
		}
}

class CircleDemo
{
	public static void main(String[] args)
	{
		Circle c = new Circle(1.0);
		double area = c.circle_area();
		System.out.println("area:"+area);
	}
}