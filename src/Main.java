public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задача 2
        System.out.println("Задача 2:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задача 3
        System.out.println("Задача 3:");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        //Задача 4
        System.out.println("Задача 4:");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задача 5
        System.out.println("Задача 5:");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.print(i + " является високосным. ");
        }
        System.out.println("\n");

        //Задача 6
        System.out.println("Задача 6:");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задача 7
        System.out.println("Задача 7:");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задача 8
        System.out.println("Задача 8:");
        int savings = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += savings;
            System.out.print("Месяц " + i + "-й, сумма накопления равна - " + total + " рублей. ");
        }
        System.out.println("\n");

        //Задача 9
        System.out.println("Задача 9:");
        int wholeAmount = 0;
        for (int i = 1; i <= 12; i++) {
            wholeAmount += wholeAmount / 100;
            wholeAmount += savings;
            System.out.print("Месяц " + i + "-й, сумма накопления равна - " + wholeAmount + " рублей. ");
        }
        System.out.println("\n");

        //Задача 10
        System.out.println("Задача 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}