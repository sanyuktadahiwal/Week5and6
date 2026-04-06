import java.util.Scanner;
public class lvl2-Youngest_Tallest {
    public static void main(String[] args) {
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int ages[] = new int[3];
        double heights[] = new double[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the age of " + friends[i] + ":");
            ages[i] = sc.nextInt();
            System.out.println("Enter the height of " + friends[i] + ":");
            heights[i] = sc.nextDouble();
        }
        int minAgeIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        int maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }   
        System.out.println("The youngest friend is: " + friends[minAgeIndex] + " with age " + ages[minAgeIndex]);
        System.out.println("The tallest friend is: " + friends[maxHeightIndex] + " with height " + heights[maxHeightIndex] + " cm");

    }
}