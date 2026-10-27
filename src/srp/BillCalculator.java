package srp;

public class BillCalculator {
    private DeductionCalculator deductionCalc;
    private VATCalculator vatCalc;

    public BillCalculator() {
        this.deductionCalc = new DeductionCalculator();
        this.vatCalc = new VATCalculator();
    }

    public void calculateTotal(Bill bill) {
        bill.billDeduction = deductionCalc.calculateDeduction(bill);
        bill.VAT = vatCalc.calculateVAT(bill);
        bill.billTotal = (bill.billAmount - bill.billDeduction) + bill.VAT;
    }
}