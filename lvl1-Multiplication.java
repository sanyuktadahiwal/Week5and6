import java.util.Scanner;
public class lvl1-Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int[][] table = new int[num][10];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}