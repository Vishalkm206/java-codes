class Math{
	public static void main(String[] args){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int sum=0;
		int subs=0;
		int multi;
		int div;
		System.out.println("Given number a="+a+" and b="+b);
		System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
		System.out.println("Enter your choice: ");
		int choice=Integer.parseInt(args[2]);
		switch(choice){
			case 1:
				sum=a+b;
				System.out.println("Addition is: "+sum);
				break;
			case 2:
				subs=a-b;
				System.out.println("Substraction is: "+subs);
				break;
			case 3:
				multi=a*b;
				System.out.println("Multiplication is: "+multi);
				break;
			case 4:
				div=a/b;
				System.out.println("Division is: "+div);
				break;
			default:
				System.out.println("Wrong choice\n");
				break;
		}
	}
}