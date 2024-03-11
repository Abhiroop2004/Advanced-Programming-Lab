import java.util.Scanner;

class MatrixOp {
    int a[][], b[][], r1, r2, c1, c2, i, j, k, temp;

    MatrixOp(int a[][], int row1, int column1, int b[][], int row2, int column2) {
        this.a = a;
        this.b = b;
        r1 = row1;
        r2 = row2;
        c1 = column1;
        c2 = column2;
        i = j = k = temp = 0;
    }

    void multiply() {
        if (c1 != r2)
            return;
        System.out.println("A*B=");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                temp = 0;
                for (k = 0; k < c1; k++) {
                    temp = temp + (a[i][k] * b[k][j]);
                }
                System.out.print(temp + "    ");
            }
            System.out.println("");
        }
    }

    void addition() {
        if (c1 != c2 || r1 != r2)
            return;
        System.out.println("A+B=");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++)
                System.out.print((a[i][j] + b[i][j]) + "    ");
            System.out.println("");
        }
    }

    void subtraction() {
        System.out.println("A-B=");
        if (c1 == c2 || r1 == r2) {
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c1; j++)
                    System.out.print((a[i][j] - b[i][j]) + "    ");
                System.out.println("");
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ch, i, j, row, column;
        System.out.println("Enter the 1st Matrix:");
        System.out.println("Enter rows:");
        row = s.nextInt();
        System.out.println("Enter columns:");
        column = s.nextInt();
        System.out.println("Enter values:");
        int a[][] = new int[row][column];
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++)
                a[i][j] = s.nextInt();
        }

        System.out.println("Enter the 2nd Matrix:");
        System.out.println("Enter rows:");
        int row2 = s.nextInt();
        System.out.println("Enter columns:");
        int column2 = s.nextInt();
        System.out.println("Enter values:");
        int b[][] = new int[row2][column2];
        for (i = 0; i < row2; i++) {
            for (j = 0; j < column2; j++)
                b[i][j] = s.nextInt();
        }

        System.out.println("What operation? 1-Addition, 2-Multiplication, 3-Subtraction");
        ch = s.nextInt();
        MatrixOp m = new MatrixOp(a, row, column, b, row2, column2);
        switch (ch) {
            case 1:
                m.addition();
                break;
            case 2:
                m.multiply();
                break;
            case 3:
                m.subtraction();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
