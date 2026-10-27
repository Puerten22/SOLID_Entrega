package dip;

public class VAT implements IVAT {
	@Override
	public float kalkulatuVAT(float kopurua) {
		return kopurua * 0.16f;
	}
}
