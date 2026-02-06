import java.util.Scanner;
public class Rotate2x2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < 2; j++) {
            for (int i = 1; i >= 0; i--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
