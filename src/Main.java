import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printingALeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) && (year > 1584)) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    public static void printingTheLink(int clientOS, int clientDeviceYear) {
        String osName = (clientOS == 0) ? "iOS" : "Android";
        if (clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке");
        } else {
            System.out.println("Установите версию приложения для " + osName + " по ссылке");
        }
    }

    public static int writeDistances(int deliveryDistance) {
        int temp = 1;
        if (deliveryDistance >= 100) {
            return temp -1;
        } else if (deliveryDistance >= 60) {
            temp = temp + 1 + 1;
            return temp;
        } else if (deliveryDistance >= 20) {
            temp = temp +1;
            return temp;
        }
        return temp;
    }

        public static void main(String[] args) {

        System.out.println("Задача 1");
        int year = 2025;
        printingALeapYear(year);

        System.out.println("Задача 2");
        int clientDeviceYear = LocalDate.now().getYear();
        byte clientOS = 0;
        printingTheLink(clientOS, clientDeviceYear);

        System.out.println("Задача 3");
            int dileveryDays = writeDistances(21);
            System.out.println("Потребуется дней: " + dileveryDays);
    }
}