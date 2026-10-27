package srp;

import java.util.Date;

public class Bill {
    public String code;
    public Date billDate;
    public float billAmount;
    public float VAT;
    public float billDeduction;
    public float billTotal;
    public int deductionPercentage;

    public Bill(String code, Date billDate, float billAmount, int deductionPercentage) {
        this.code = code;
        this.billDate = billDate;
        this.billAmount = billAmount;
        this.deductionPercentage = deductionPercentage;
    }
}