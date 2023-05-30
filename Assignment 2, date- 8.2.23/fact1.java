import java.util.Scanner;

class fact1 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int a, ans;
		factorial fac=new factorial();
		System.out.println("Enter value: ");
		a = num.nextInt();
		ans = fac.facto(a);
		System.out.println("Factorial of " + a + " is " + ans);
		num.close();
	}

}

