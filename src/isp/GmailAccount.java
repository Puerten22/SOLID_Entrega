package isp;

public class GmailAccount implements Emailable {
    private String name;
    private String emailAddress;

    public GmailAccount(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    @Override
    public String getEmail() {
        return emailAddress;
    }
}