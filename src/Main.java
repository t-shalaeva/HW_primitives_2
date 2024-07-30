public class Main {
    public static void main(String[] args) {

        int balance = 50;
        int depositAmount = 2389;
        int totalAmount;

        if (depositAmount > 1000) {
            totalAmount = depositAmount / 100;
            balance = balance + depositAmount + totalAmount;
        } else {
            totalAmount = 0;
            balance = balance + depositAmount;
        }
        System.out.println("Итоговый счёт: " + balance + " рублей, количество бонусных рублей: " + totalAmount);

    }
}