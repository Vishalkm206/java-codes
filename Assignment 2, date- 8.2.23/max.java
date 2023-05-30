import java.util.Scanner;
class max{
	public static void main(String[] args){
		int n, i, large, small;
		Scanner p=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter the length of array:");
		n=p.nextInt();
		System.out.println("Enter elements:");
		for(i=0;i<n;i++){
			a[i]=p.nextInt();
		}
		large=a[0];
		small=a[0];
		for(i=0;i<n;i++){
			if(a[i]>large)
				large=a[i];
		}
		for(i=0;i<n;i++){
			if(a[i]<small)
				small=a[i];
		}
		System.out.println("Largest value is: "+large);
		System.out.println("Smallest value is "+small);
		p.close();
	}
}