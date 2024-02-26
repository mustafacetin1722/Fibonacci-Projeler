import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        int n = scanner.nextInt();
        int a = 0 , b = 1;
        for (int i = 0; i < n; i++){
            System.out.print(a + " ");
            int temp = a +b;
            a = b;
            b = temp;
        }
        System.out.println();
        int  y = 0 , z = 1 , k = 0;
        while (k < n){
            System.out.print(y + " ");
            int temp = y + z;
            y = z;
            z = temp;
            k++;
        }
    }
}