import java.util.Scanner;
public class lvl3-Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        String numberStr= sc.nextLine();
        int[] frequency = new int[10];
        for (int i=0; i<numberStr.lenght(); i++){
            char ch = numberStr.charAr(i);
            if(Character.idsDigit(ch)){
                int digit = ch - '0';
                frequency[digit]++;
            }
        }
        System.out.println("Digit Frequency Table: ");
        for (int i=0; i<10; i++){
            if(frequncy[i]>0){                
                System.out.println("Digist " + i + " Occurs " + frequency[i] + " times.");
            }
        }
        sc.close();
    }
}