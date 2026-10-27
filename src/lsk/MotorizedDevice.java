package lsk;

public abstract class MotorizedDevice extends TransportationDevice {
    protected Engine engine;

    public void startEngine() {
        engine.start();
    }
}
