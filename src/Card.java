public class Card {
    private double funds;

    public  Card (double funds) {
        this.funds = funds;
    }

    public double depositCard (double value) {
        funds += value;
        return funds;
    }

    public double withDraw (double value) throws NotEnoughFundsException {

        if(funds < value) {
            throw new NotEnoughFundsException("You wish");
        }
        funds -= value;
        return funds;
    }

    public double getFunds(){
        return funds;
    }
}
