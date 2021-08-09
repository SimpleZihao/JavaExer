class IfTest{
	/*
		需求：输入数字，显示出对应的星期数，如1对应星期一
	
	*/
	public static void main(String[] args){
		int day = 3;
		if (day==1){
			System.out.println(day+"对应的是星期一");	
		}
		else if (day==2){
			System.out.println(day+"对应的是星期二");	
		}
		else if (day==3){
			System.out.println(day+"对应的是星期三");	
		}
		else if (day==4){
			System.out.println(day+"对应的是星期四");	
		}
		else if (day==5){
			System.out.println(day+"对应的是星期五");	
		}
		else if (day==6){
			System.out.println(day+"对应的是星期六");	
		}
		else if (day==7){
			System.out.println(day+"对应的是星期日");	
		}
		else {
			System.out.println("输入错误");	
		}
		
	}
	
}