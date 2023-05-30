class leap{
	public static void main(String[] args){
		int ly=Integer.parseInt(args[0]);
		try{
			if(ly%4==0)
				if(ly%100==0)
					System.out.println("Leapyear");
				else
					System.out.println("Not Leapyear");
		}
		catch(Exception s){
			System.out.println("Error");
		}
	}
}