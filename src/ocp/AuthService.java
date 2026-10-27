package ocp;

import java.util.HashMap;
import java.util.Map;

/**
 * Autentikazio kudeatzailea. OCP printzipioa betetzen du,
 * zerbitzu berriak gehitzean klase hau aldatu beharrik ez dagoelako.
 */
public class AuthService {
    private Map<String, AuthenticationService> services;

    public AuthService() {
        this.services = new HashMap<>();
    }

    /**
     * Zerbitzu berri bat erregistratzeko metodoa.
     */
    public void registerService(String serviceName, AuthenticationService service) {
        services.put(serviceName.toLowerCase(), service);
    }

    /**
     * Autentikazioa exekutatzen duen metodoa.
     */
    public boolean signIn(String serviceName, String log, String pass) {
        AuthenticationService service = services.get(serviceName.toLowerCase());
        if (service != null) {
            return service.signIn(log, pass);
        }
        System.out.println("Ez da aurkitu zerbitzua: " + serviceName);
        return false;
    }
}

