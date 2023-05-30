import java.util.Scanner;

class matrixAdd {
    public static void main(String[] args) {
        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        int c[][] = new int[10][10];
        int i, j, row, col;
        Scanner p = new Scanner(System.in);

        // 1st matrix

        System.out.println("Enter row for 1st array");
        row = p.nextInt();
        System.out.println("Enter column for 1st array");
        col = p.nextInt();
        System.out.println("Enter the elements");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                a[i][j] = p.nextInt();
            }
        }
        System.out.println("1st array");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // 2nd matrix

        System.out.println("Enter row for 2nd array");
        row = p.nextInt();
        System.out.println("Enter column for 2nd array");
        col = p.nextInt();
        System.out.println("Enter the elements");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                b[i][j] = p.nextInt();
            }
        }
        System.out.println("2nd array");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        // matrix addition

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Addition of two matrix is:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        p.close();
    }
}