import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       System.out.println("Please enter the Celsius degree: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (9/5)*celsius + 32;

        System.out.println(fahrenheit);



    }
}
