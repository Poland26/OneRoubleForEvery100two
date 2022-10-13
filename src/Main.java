public class Main {
    public static void main(String[] args) {
        int accountBalance = 0;
        int replenishmentAmount = 1100;
        int bonus;

        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }
        System.out.println(accountBalance + replenishmentAmount + bonus);
    }
}
