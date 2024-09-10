package messageprocessing;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
