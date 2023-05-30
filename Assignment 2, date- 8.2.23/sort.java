import java.util.Scanner;
class sort{
	public static void main(String[] args){
		int a[]= new int[10];
		int n, i, j, temp;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=num.nextInt();
		System.out.println("Enter elements");
		for(i=0;i<n;i++){
			a[i]=num.nextInt();
		}
		System.out.println("before sorting");
		for(i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		
		//sorting
		
		for(i=0;i<n;i++){
			for(j=1;j<n-i;j++){
				if(a[j-1]>a[j]){
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
			}
		}
	}
		System.out.println("\nSorted array");
		for(i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		num.close();
    }
}