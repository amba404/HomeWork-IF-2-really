public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1\n");
        {
            int clientOS = 0; // 0: iOS, 1: Android

            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        }

        System.out.println("\nTask 2\n");
        {
            int clientOS = 0; // 0: iOS, 1: Android
            int clientDeviceYear = 2015;

            switch (clientOS) {
                case 0:
                    System.out.printf("Установите %sверсию приложения для iOS по ссылке\n",
                            clientDeviceYear < 2015 ? "облегченную " : "");
                    break;
                case 1:
                    System.out.printf("Установите %sверсию приложения для Android по ссылке\n",
                            clientDeviceYear < 2015 ? "облегченную " : "");
                    break;
            }
        }

        System.out.println("\nTask 3\n");
        {
            int year = 2021;

            if (year < 1584) {
                System.out.printf("%d год не является високосным", year);
            } else if (year % 400 == 0) {
                System.out.printf("%d год является високосным", year);
            } else if (year % 100 == 0) {
                System.out.printf("%d год не является високосным", year);
            } else if (year % 4 == 0) {
                System.out.printf("%d год является високосным", year);
            } else {
                System.out.printf("%d год не является високосным", year);
            }

            System.out.println();
        }

        System.out.println("\nTask 4\n");

        {
            int deliveryDistance = 19;
            int deliveryDays = 1;

            if (deliveryDistance > 100) {
                System.out.println("Доставки нет");
            } else {
                if (deliveryDistance > 20) {
                    deliveryDays += 1;
                }

                if (deliveryDistance > 60) {
                    deliveryDays += 1;
                }

                System.out.println("Потребуется дней: " + deliveryDays);
            }
        }

        System.out.println("\nTask 5\n");

        {
            int monthNumber = 12;

            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Текущий сезон: Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Текущий сезон: Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Текущий сезон: Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Текущий сезон: Осень");
                    break;
                default:
                    System.out.println("Ошибка! Нет сезона для такого месяца");
            }
        }
    }
}