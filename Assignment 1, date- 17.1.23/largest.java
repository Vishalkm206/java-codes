class largest{
	public static void main(String[] args){
		try{
			int a, i, n, max;
			a=Integer.parseInt(args[0]);
			max=a;
			for(i=0;i<args.length;i++){
					a=Integer.parseInt(args[i]);
					if(max<a){
						max=a;
			        }
		    }
			System.out.println("max is: "+max);
	    }
		catch(Exception s){
			System.out.println("error");
		}
    }
}