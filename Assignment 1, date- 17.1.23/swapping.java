class swapping{
	public static void main(String[] args){
		int temp=0;
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		try{
			System.out.println("Given  numbers are: "+a+" "+b+" "+c);
			temp=c;
			c=b;
			b=a;
			a=temp;
			System.out.println("After swapping numbers are: "+a+" "+b+" "+c);
		}
		catch(Exception s){
			System.out.println("Error");
		}
		
	}
}