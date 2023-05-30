import java.util.Scanner;

class add{
	public static void main(String args[]){
		try{
		Scanner num=new Scanner(System.in);
		int a, b, sum;
		System.out.println("Enter 1st number: ");
		a=num.nextInt();
		System.out.println("Enter 2nd number: ");
		b=num.nextInt();
		sum=a+b;
		System.out.println("Addition is: "+sum);
		num.close();
		}
		catch(Exception e){
			System.out.println("Invalid input!");
		}
	}
}