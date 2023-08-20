public class Main {
    public static void main(String[] args) {

        int initialCount = 100; // Начальный счёт
        int amount = 1200; // Сумма пополнения
        int bonus = amount / 100; // Количество бонусных рублей
        int count; // Итоговый счёт
        int middleCount = initialCount + amount;  // Начальный счёт + сумма пополнения

        if (amount > 1000) {
            count = middleCount + bonus;
        } else {
            bonus = 0;
            count = middleCount;
        }

        System.out.println((bonus) + " Кол-во бонусов ");
        System.out.println((count) + " Итоговый счёт ");

    }
}