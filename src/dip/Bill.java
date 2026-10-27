package dip;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	
	private final IDeduction deductionZerbitzua;
	private final IVAT vatZerbitzua;
	
	public Bill(IDeduction deductionZerbitzua, IVAT vatZerbitzua) {
        this.deductionZerbitzua = deductionZerbitzua;
        this.vatZerbitzua = vatZerbitzua;
    }
	
	public void totalCalc() {
		billDeduction = deductionZerbitzua.kalkulatuDedukzioa(billAmount, deductionPercentage);
		VAT = vatZerbitzua.kalkulatuVAT(billAmount);
		billTotal = (billAmount - billDeduction) + VAT;
;	}
}
