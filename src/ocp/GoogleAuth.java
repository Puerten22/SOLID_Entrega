package ocp;

public class GoogleAuth implements AuthenticationService {
    @Override
    public boolean signIn(String log, String pass) {
        // Google APIa erabili
        System.out.println("Google bidez autentikatzen: " + log);
        return true;
    }
}