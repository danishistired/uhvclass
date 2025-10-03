import java.util.Scanner;
#lmao two
class EXP3j{
    public static void main(String[] args){
        int[][] a = new int[3][3];
        int[][] b = new int[3][2];
        int[][] c = new int[3][2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements of first matrix (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}