import java.util.Scanner;

public class p3 {

    public static void main(String[] args) {
        System.out.println("Enter a positive number");
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while (number > 0) {
            int num = number % 10;
            sum = sum + num;
            number = number / 10;

        }
        System.out.println(sum);
    }
}

