import java.util.Scanner;

class combination{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		int n, r, ans;
		System.out.println("Enter value of n: ");
		n=num.nextInt();
		System.out.println("Enter value of r: ");
		r=num.nextInt();
		ans=fact(n)/(fact(r)*fact(n-r));
		System.out.println("Answer is: "+ans);
		num.close();
	}
	static int fact(int a){
		if(a==0 || a==1)
			return 1;
		else
			return a*fact(a-1);
	}
}