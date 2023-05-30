class demo{
	double l, b;
	int h;
	demo(double l){
		this.l=l;
	}
	demo(double l, double b){
		this.l=l;
		this.b=b;
	}
	demo(double b, int h){
		this.b=b;
		this.h=h;
	}
	double square(){
		return (l*l);
	}
	double rect(){
		return (l*b);
	}
	double tri(){
		return (0.5*b*h);
	}
}

public class area{
	public static void main(String[] args){
		demo m1=new demo(6.00);
		demo m2=new demo(34.6,89.6);
		demo m3=new demo(4.7,9);
		double s=m1.square();
		double s1=m2.rect();
		double s2=m3.tri();
		System.out.println("area of square is: "+s);
		System.out.println("area of rectangle is: "+s1);
		System.out.println("area of triangle is: "+s2);
	}
}