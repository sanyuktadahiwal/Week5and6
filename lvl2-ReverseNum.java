import java.util.Scanner;
public class lvl2-ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= sc.nextInt();
        int temp = number;
        int digitCount=9;
        while(temp!=0){
            digitCount++;
            temp/=10;
        } 
        int[] digits = new int[digitCount];
        temp = number;
        for(int i=0; i<digitCount; i++){
            digits[i] = temp%10;
            temp/=10;
        }
        System.out.print("Reversed number: ");
        for(int i=0; i<digitCount; i++){
            System.out.print(digits[i]);
        }
        scanner.close();
    }
}