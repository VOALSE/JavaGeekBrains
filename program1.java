// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) 

import java.util.Scanner;


public class program1 {

    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.println("Введи число N: ");
            int n = iScanner.nextInt();

            int i = 0;
            int sum = 0;
            int multi = 1;
            for (i = 1; i <= n; i++) {
                sum += i;
                multi *= i;
            }

            System.out.printf("Сумма чисел от 1 до %d = %d\n", n, sum);
            System.out.printf("Произведение чисел от 1 до %d = %d", n, multi);
        }
    }
}