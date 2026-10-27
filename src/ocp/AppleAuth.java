package ocp;

public class AppleAuth implements AuthenticationService {
    @Override
    public boolean signIn(String log, String pass) {
        // Apple APIa erabili
        System.out.println("Apple bidez autentikatzen: " + log);
        return true;
    }
}