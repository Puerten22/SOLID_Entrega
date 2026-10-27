package dip;

public class Deduction implements IDeduction {
	@Override
	public float kalkulatuDedukzioa(float kopurua, int ehunekoa) {
		return(kopurua* ehunekoa)/ 100.0f;
	}
	
}
