package srp;

public class VATCalculator {

    public float calculateVAT(Bill bill) {
        // 3. Galderako baldintza sartuta 
        if ("0".equals(bill.code)) {
            return 0;
        }
                return bill.billAmount * 0.16f;
    }
}


