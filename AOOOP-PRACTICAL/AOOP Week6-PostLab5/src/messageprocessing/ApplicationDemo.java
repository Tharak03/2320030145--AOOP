package messageprocessing;

public class ApplicationDemo {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();

        MyApplication emailApp = new MyApplication(emailService);
        MyApplication smsApp = new MyApplication(smsService);

        emailApp.processMessage("Hello via Email!");
        smsApp.processMessage("Hello via SMS!");
    }
}
