class demo{
	int a, b;
	double a2, b2;
	demo(int a, int b){
		this.a=a;
		this.b=b;
		
	}
	demo(double a2, double b2){
		this.a2=a2;
		this.b2=b2;
	}
	int add(){
		return (a+b);
	}
	double add1(){
		return (a2+b2);
	}
}

public class math{
	public static void main(String[] args){
		demo m1=new demo(65,87);
		demo m2=new demo(34.6,89.6);
		int s=m1.add();
		double s1=m2.add1();
		System.out.println("sum is: "+s);
		System.out.println("sum is: "+s1);
	}
}