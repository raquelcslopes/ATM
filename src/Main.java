public class Main {
    public static void main(String[] args) {


    Card card1 = new Card(263.93);
    ATM atm = new ATM();

    atm.setMoney(8000);

        atm.withDrawable(card1);
    }
}