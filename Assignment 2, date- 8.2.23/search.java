import java.util.Scanner;

class search {
	public static void main(String[] args) {
		int n, i, key;
		int a[] = new int[10];
		Scanner num = new Scanner(System.in);
		System.out.println("Enter sizee of array");
		n = num.nextInt();
		System.out.println("Enter elements");
		for (i = 0; i < n; i++) {
			a[i] = num.nextInt();
		}
		System.out.println("Enter element to search");
		key = num.nextInt();
		for (i = 0; i < n; i++) {
			if (key == a[i])
				key = a[i];
		}
		System.out.println(key + " element is found");
		num.close();
	}
}