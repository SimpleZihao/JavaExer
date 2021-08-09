class ForTest{
	public static void main(String[] args){
		int count = 0;
		for(int i=1;i<101;i++){
			if(i%6 == 0){
				count++;
			}
		}
		System.out.println(count);
	}
}