class swap{
	int a, b;
	swap(int a, int b){
		this.a=a;
		this.b=b;
	}
	void swapvar(){
		int temp=b;
		b=a;
		a=temp;
	}
	void display(){
		System.out.println("\nafter swapping:\n a="+a+"b="+b);
	}
}

class var{
	public static void main(String[] args){
		swap s1=new swap(8,9);
		s1.swapvar();
		s1.display();
	}
}