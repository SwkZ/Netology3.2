public class Main {
    public static void main(String[] args) {
        int starter = 100;
        int incoming = 1100;
        int fullBalance = starter + incoming;
        int porog = 1000;

        if (incoming > porog) {
            int incomingBonus = incoming / 100;
            System.out.println("Итоговый бонус к пополнению: " + incomingBonus);
            System.out.println("Ваш баланс: " + (fullBalance + incomingBonus));
        } else {
            int incomingBonus = 0;
            System.out.println("Ваш баланс: " + fullBalance);
        }
    }
}
