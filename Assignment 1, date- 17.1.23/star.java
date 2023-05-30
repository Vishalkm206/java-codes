class star{
	public static void main(String[] args){
		int i, j;
		try{
			for(i=0;i<5;i++){
				for(j=0;j<i;j++){
					System.out.print("*");
				}
				System.out.println("\n");
			}
		}
		catch(Exception s){
			System.out.println("error!");
		}
	}
}