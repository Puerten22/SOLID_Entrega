package isp;

public class SMSSender {
    public static void sendSMS(SMSable c, String message) {
        System.out.println("SMSa bidaltzen honako zenbakira: " + c.getTelephone());
    }
}