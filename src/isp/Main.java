package isp;

public class Main {
    public static void main(String[] args) {
        GmailAccount gmailObj = new GmailAccount("Ane", "ane@gmail.com");
        
        EmailSender.sendEmail(gmailObj, "Kaixo hau proba bat da");
    }
}