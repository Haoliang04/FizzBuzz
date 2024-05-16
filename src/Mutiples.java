public class Mutiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            boolean mutiplOfFive = i % 5 == 0;
            boolean mutiplOfThree = i % 3 == 0;

            if (mutiplOfFive || mutiplOfThree) {
                System.out.println(i);
                count++;
            }

        }
        System.out.println("The total number of mutiple of 5 or 3 below 1000 is " + count);

    }
}
