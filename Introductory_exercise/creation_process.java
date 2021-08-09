 class Demo
 {
	 static int x=1;
	 int y=1;
	 
	 static
	 {
		 System.out.println("static code...x"+x);
	 }
	 
	 {
			System.out.println("cons code ...y"+y);
	 }
	 
	 Demo()
	 {
		 System.out.println("cons function ...y"+y);
	 }
 }
 
 class CreateObjectTest
 {
	 public static void main(String[] args)
	 {
		 Demo d = new Demo();
	 }
 }
 
 