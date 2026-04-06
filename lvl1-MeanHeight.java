import java.util.Scanner;
public class lvl1-MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        for (int i = 0; i<11; i++){
            System.out.println("Enter height of player " + i);
            heights[(i-1)] = sc.nextDouble();
            sum += heights[(i-1)];
        }
        double mean = sum / 11;
        System.out.println("Mean height of the players is: " + mean);
    }
}