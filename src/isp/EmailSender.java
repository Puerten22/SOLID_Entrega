package isp;

public class EmailSender {
    public static void sendEmail(Emailable c, String message) {
        System.out.println("Emaila bidaltzen honako helbidera: " + c.getEmail());
    }
}