package Homework3;

import java.util.Random;
import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {
        int tries = 2;

        Random random = new Random();
        int i = random.nextInt(10);

        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Угадайте число от 0 до 9: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Было введено нечисловое значение!");
                scanner.nextLine();
                continue;
            }

            int number = scanner.nextInt();

            if (number > i && tries > 0) {
                System.out.println("Загаданное число меньше");
                System.out.println("Осталось попыток: " + tries);
                tries--;
                continue;
            }
            if (number < i && tries > 0) {
                System.out.println("Загаданное число больше");
                System.out.println("Осталось попыток: " + tries);
                tries--;
                continue;
            }
            if (number == i) {
                System.out.println("Вы угадали: " + number);

                System.out.println("Повторить игру еще раз? 1 - да/ 2 - нет");
                int answer = scanner.nextInt();
                while (answer == 1 || answer == 2) {
                    if (answer == 1) {
                        System.out.println("Продолжаем!");
                        continue;
                    }
                    if (answer == 2) {
                        System.out.println("До свидания.");
                        break;
                    }
                }
            }
            if (tries == 0) {
                System.out.println("Вы проиграли");

                System.out.println("Повторить игру еще раз? 1 - да/ 2 - нет");
                int answer = scanner.nextInt();
                if (answer == 1) {
                    System.out.println("Продолжаем!");
                    continue;
                }
                if (answer == 2) {
                    System.out.println("До свидания.");
                    break;
                }

            }
        }
    }
}



