package srp;

public class DeductionCalculator {

    public float calculateDeduction(Bill bill) {
        // 1. Galderako baldintza sartuta:
        if (bill.billAmount > 50000) {
            return (bill.billAmount * bill.deductionPercentage + 5) / 100;
        } else {
            return (bill.billAmount * bill.deductionPercentage) / 100;
        }
    }
}

