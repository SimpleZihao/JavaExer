class Demo
{
	// �Ը���������ͨ�������ĽǱ��ȡԪ��
	int getElement(int[] arr, int index)
	{
		if(arr==null)
		{
			throw new NullPointerException("arrָ������鲻����");
		}
		
		if(index<0 || index>=arr.length)
		{
			// 1. ����һ���쳣���󣬷�װһЩ��ʾ��Ϣ���Զ��壩
			// 2.��Ҫ����������֪�������ߣ�ͨ��throw�ؼ�����ɡ� throw �쳣����;
			// 3. throw���ں����ڣ��׳��쳣���󣬲����Խ�������
			throw new ArrayIndexOutOfBoundsException("����ĽǱ꣬"+index+"�����������в�����");
		}
		
		int element = arr[index];
		return element;
	}
}

class ExceptionDemo
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		int[] arr = {34, 12, 67};
		int num = d.getElement(arr, 2);
		System.out.println("num"+num);
		System.out.println("over");
	}
}