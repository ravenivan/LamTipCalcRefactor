public class TipCalculator {
    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int numPeople, double tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }
    public double getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public double tipAmount() {
        return totalBill() - totalBillBeforeTip;
    }

    public double totalBill() {
        return totalBillBeforeTip * (tipPercentage / 100 + 1);
    }

    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip / numPeople;
    }

    public double perPersonTipAmount() {
        return tipAmount() / numPeople;
    }

    public double perPersonTotalCost() {
        return totalBill() / numPeople;
    }
}
