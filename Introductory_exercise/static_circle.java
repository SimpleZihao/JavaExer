class Circle
{
		private double radius; //Բ�뾶
		// ÿ�� Բ�����ж��洢һ�ݣ��˷ѿռ䡣ʵ�ֶ���������static��̬�ؼ���
		private static double pi=3.14;	
		// ���캯��
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