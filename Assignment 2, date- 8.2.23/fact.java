import java.util.Scanner;
class fact{
	public static void main(String[] args){
		Scanner num=new Scanner(System.in);
		int a, ans;
		System.out.println("Enter value: ");
		a=num.nextInt();
		ans=factorial(a);
		System.out.println("Factorial is: "+ans);
		num.close();
	}
	static int factorial(int n){
		if(n==0 || n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
}