public class ATM {
    private Card card;
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void withDrawable (Card card1) {
        try {
            card1.withDraw(300);
            System.out.println("you have " + card1.getFunds());
        } catch (NotEnoughFundsException e) {
            System.out.println("Ups");
        }
    }
}
