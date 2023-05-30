class add1{
	public static void main(String args[]){
		try{
			
			int a, b,sum;
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			sum=a+b;
			System.out.println("The addition is: "+sum);
		}
		catch(Exception e){
			System.out.println("Error!");
		}
	
	}
}