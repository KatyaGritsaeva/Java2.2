public class Main {
    public static void main(String[] args) {

        // Входные данные
        int sbalance = 100;
        int replenishment = 1200;

        // Логика работы
        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        }

        int total = sbalance + replenishment + bonus;
        System.out.println("Итоговый счет: " + total);
        System.out.println("Коcdличество полученных бонусов: " + bonus);
    }
}