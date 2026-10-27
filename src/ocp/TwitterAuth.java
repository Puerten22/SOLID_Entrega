package ocp;

public class TwitterAuth implements AuthenticationService {
    @Override
    public boolean signIn(String log, String pass) {
        // Twitter APIa erabili
        System.out.println("Twitter bidez autentikatzen: " + log);
        return true;
    }
}