// Вывести все простые числа от 1 до 1000


public class program2 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {

            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.print(i + " ");
            }
        }
    }

}