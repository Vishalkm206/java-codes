class div{
	public static void main(String[] args){
		int a=Integer.parseInt(args[0]);
		try{
			if(a%5==0)
				System.out.println("Divisible by 5");
			else
				System.out.println("Not divisible by 5");
		}
		catch(Exception s){
			System.out.println("Error");
		}
	}
}