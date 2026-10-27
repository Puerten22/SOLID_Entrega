package ocp;

public class FacebookAuth implements AuthenticationService {
    @Override
    public boolean signIn(String log, String pass) {
        // Facebook APIa erabili
        System.out.println("Facebook bidez autentikatzen: " + log);
        return true;
    }
}