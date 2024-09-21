import java.time.LocalDate;

public class Main {

    public static void findLeapYear(int year) {
        int everyFourth = year % 4;
        int everyHundredth = year % 100;
        int everyFourthHundredth = year % 400;
        if (year > 1584 && everyFourth == 0 && everyHundredth != 0) {
            System.out.println(year + " год является високосным.");
        } else if (year > 1584 && everyHundredth == 0 && everyFourthHundredth == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year > 1584 && everyFourthHundredth != 0) {
            System.out.println(year + " год является невисокосным.");
        } else if (year < 1584) {
            System.out.println("Извините, високосный год еще не был введен.");
        }
    }

    public static void installUpdate(int OS, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year < currentYear && OS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (year < currentYear && OS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            if (year >= currentYear && OS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
            if (year >= currentYear && OS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
    }

    public static int findDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance > 20 && distance < 60) {
            return 2;
        } else if (distance > 60 && distance < 100) {
            return 3;
        } else
            return -1;
    }

    public static void main(String[] args) {

        /* Задача 1
        Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он
        високосным, и выводит результат в консоль. Эту проверку вы уже реализовывали в задании по
        условным операторам. Теперь проверку оберните в метод и используйте год, который приходит
        в виде параметра. Результат программы выведите в консоль. Если год високосный, то
        напечатайте сообщение: «...  год — високосный год». Если год невисокосный, то: «... год —
        невисокосный год».
         */
        System.out.println("Задача 1");
        int year = 2021;
        findLeapYear(year);
        System.out.println();

        /* Задача 2
        Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS,
        1 — Android ) и год выпуска устройства.
        Если устройство старше текущего года, предложите ему установить облегченную версию.
        Текущий год можно получить таким способом: int currentYear = LocalDate.now().getYear();
        Или самим задать значение вручную — ввести в переменную числовое значение.
        В результате программа должна выводить в консоль сообщение, какую версию приложения
        (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.
         */
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2013;
        installUpdate(clientOS, clientDeviceYear);
        System.out.println();

        /* Задача 3
        Возвращаемся к задаче на расчет дней доставки банковской карты.
        Ваша задача — доработать код, а именно написать метод, который на вход принимает
        дистанцию и возвращает итоговое количество дней доставки.
         */
        System.out.println("Задача 3");
        int deliveryDistance = 55;
        int daysDelivery = 0;
        daysDelivery = findDeliveryDays(deliveryDistance);
        if (daysDelivery > 0) {
            System.out.println("На доставку потребуется дней: " + daysDelivery);
        } else System.out.println("Извините, доставки нет!");
    }
}