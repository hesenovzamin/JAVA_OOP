package Interface;

public class SmsSender implements NotificationSender {

    @Override
    public void send(String msj) {
        System.out.println("Sending SMS: " + msj);
    }
}
