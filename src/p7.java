public class p7 {
    public static void main(String[] args) {
        final double CONVERSION_RATE = 1.906;
        int[] miles = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("miles\tkilometers\t|\tkilometers\tmiles");
        for (int mile =1; mile <=10; mile++){
            System.out.println("%2d\t\t %5.2f\t\t|\t\t%.2f%n");
        }
    }
}
