class mile{
	public static void main(String[] args){
		float mile=Integer.parseInt(args[0]);
		try{
			double km=1.60934;
			km=mile*km;
			System.out.println(" "+km+"km");
		}
		catch(Exception s){
			System.out.println("error");
		}
		
	}
}