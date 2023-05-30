class max{
	public static void main(String[] args){
		int a=9,b=6,c=89;
		try{
			if(a>b && a>c)
				System.out.println("max: "+a);
			else if(b>c)
				System.out.println("max: "+b);
			else
				System.out.println("max is: "+c);
		}
		catch(Exception s){
			System.out.println("Error!");
		}
	
	}
}