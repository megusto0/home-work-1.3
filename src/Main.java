public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        //Задание 2
        int clientDeviceYear = 2013;
        clientOS = 1;
        if (clientDeviceYear >= 2015) {
            System.out.print("Установите версию приложения для ");
        }
        else {
            System.out.print("Установите облегченную версию приложения для ");
        }
        if (clientOS == 0) {
            System.out.println("iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Android по ссылке\n");
        }

        //Задание 3
        int year = 2021;
        boolean isYearVisokosni = false;
        if (year % 400 == 0) isYearVisokosni = true;
        if (year % 4 == 0 && year % 100 != 0) isYearVisokosni = true;
        if (isYearVisokosni) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();

        //Задание 4
        int delivery = 1;
        int deliveryDistance = 95;
        if (deliveryDistance >= 20) {
            delivery += (deliveryDistance - 20)  / 40 + 1;
        }
        System.out.println("Потребуется дней: " + delivery);
        System.out.println();

        //Задание 5
        int  monthNumber = 10;
        if (0 < monthNumber && monthNumber < 13) {
            switch (monthNumber) {
                case 1:
                    System.out.println("январь");
                    break;
                case 2:
                    System.out.println("февраль");
                    break;
                case 3:
                    System.out.println("март");
                    break;
                case 4:
                    System.out.println("апрель");
                    break;
                case 5:
                    System.out.println("май");
                    break;
                case 6:
                    System.out.println("июнь");
                    break;
                case 7:
                    System.out.println("июль");
                    break;
                case 8:
                    System.out.println("август");
                    break;
                case 9:
                    System.out.println("сентябрь");
                    break;
                case 10:
                    System.out.println("октябрь");
                    break;
                case 11:
                    System.out.println("ноябрь");
                    break;
                case 12:
                    System.out.println("декабрь");
                    break;
            }
        }
        else System.out.println("Неверный номер!");

    }
}