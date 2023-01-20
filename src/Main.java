
public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task8() {

        System.out.println("Задание 8:");
        int calcBegin = 2023 - 200;
        int calcEnd = 2023 + 100;

        for (int i = 0; i < calcEnd; i += 79)
            if (i > calcBegin)
                System.out.println(i);

        System.out.println();
    }

    private static void task7() {
        System.out.println("Задание 7:");
        int dayOfTheWeek = 1;

        for (int i = 0; i <= 31; i++) {
            if (dayOfTheWeek == 7) {
                dayOfTheWeek = 1;
                continue;
            }
            if (dayOfTheWeek == 5)
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            dayOfTheWeek++;
        }
        System.out.println();
    }

    private static void task6() {
        System.out.println("Задание 6:");
        int initialDeposit = 15000;
        double percent = 0.07;
        //long targetSavings = 12_000_000;
        int month = 1;
        int targetDate = month*12*9;

        while (month <= (targetDate)) {
            initialDeposit += initialDeposit * percent;
            month++;
            if (month % 6 == 0)
                System.out.println("Накопления через " + month + " месяц будут " + initialDeposit);
        }
        System.out.println();
    }

    private static void task5() {
        System.out.println("Задание 5:");
        int initialDeposit = 15000;
        double percent = 0.07;
        long targetSavings = 12_000_000;
        int month = 1;

        while (initialDeposit <= targetSavings) {
            initialDeposit += initialDeposit * percent;
            month++;
            if (month % 6 == 0)
                System.out.println("Накопления через " + month + " месяц будут " + initialDeposit);
        }
        System.out.println();
    }

    private static void task4() {
        System.out.println("Задание 4:");
        int initialDeposit = 15000;
        double percent = 0.07;
        long targetSavings = 12_000_000;
        int month = 1;

        while (initialDeposit <= targetSavings) {
            initialDeposit += initialDeposit * percent;
            month++;
            System.out.println("Накопления через " + month + " месяц будут " + initialDeposit);
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задание 3:");
        long population = 12_000_000;
        int birthPerThousand = 17;
        int deathPerThousand = 8;

        for (int i = 1; i <= 10; i++) {
            population += (birthPerThousand - deathPerThousand) * population / 1000;
            System.out.println("Год: " + i + ". Численность населения: " + population);
        }
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задание 2:");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }

        System.out.println();
        for (int i = 10; i > 0; i--)
            System.out.print(i + " ");

        System.out.println();
        System.out.println();
    }

    private static void task1() {
        System.out.println("Задача 1");
        final int GOAL = 2_459_000;
        int savings = 29000;
        int savingsSum = savings;
        double percent = 0.01;
        int months = 1;

        while (savingsSum <= GOAL) {
            System.out.println("Месяц: " + (months) + ". Сумма накоплений:" + savingsSum);
            savingsSum += savings + savingsSum * percent;
            months++;
        }

        System.out.println("Для того что бы накопиь " + GOAL + " потребуется " + months + " месяца");
        System.out.println();
    }
}