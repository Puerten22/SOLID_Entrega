package lsk;

public class Car extends MotorizedDevice implements Licensable{
	private String matrikula;
	
    @Override
    public void startEngine() {
        super.startEngine();
    }
    
    @Override
    public void matrikulatu(String text) {
        this.matrikula = text;
    }
}