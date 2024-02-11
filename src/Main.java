import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void printSeparator() {
        System.out.println("++++++++++++++");
        System.out.println("--------------");
    }

    public static void checkDevice(int operatingSystem, int clientDeviceYear) {

        if (operatingSystem == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение для IOS по ссылке");
        } else if (operatingSystem == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение для Android по ссылке");
        }
        if (operatingSystem == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (operatingSystem == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = checkYear(year);
        if (yearIsLeap) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static boolean checkYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || (year % 400 == 0);
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите метод : \n1. Високосный год \n2. Проверка устройства ");
            var type = scanner.nextInt();
            switch (type) {
                case 1:
                    System.out.println("Введите год: ");
                    var year = scanner.nextInt();
                    checkYear(year);
                    printIsLeapYear(year);
                    break;
                case 2:
                    System.out.println("Введите OS: ");
                    var operatingSystem = scanner.nextInt();
                    int clientDeviceYear = LocalDate.now().getYear();
                    checkDevice(operatingSystem, clientDeviceYear);
                    break;
            }
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = LocalDate.now().getYear();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 60;
        checkDistance(deliveryDistance);

    }

    public static void task4() {

        int[] issuesByMonth = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMonth.length; i++) {
            printIssues(issuesByMonth[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonth);
        printIssues(total);
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);

    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        return sum;

    }


    public static void checkDistance(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            int days = 1;
            System.out.println("Доставка в пределах 20 км занимает " + days + " сутки.");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            int days = 2;
            System.out.println("Доставка в пределах 60 км занимает " + days + " суток.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            int days = 3;
            System.out.println("Доставка в пределах 100 км занимает " + days + " суток.");

        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
    }
}



