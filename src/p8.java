public class p8 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            if ((i % 5 == 0 && i % 6 != 0) || (i % 5 != 0 && i % 6 == 0)) {
                System.out.println(i + " ");
                count++;
            }
            if (count == 10) {
                System.out.println();
                count = 0;
            }

        }
    }
}
