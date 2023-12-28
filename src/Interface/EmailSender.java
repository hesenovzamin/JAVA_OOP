package Interface;

public class EmailSender implements NotificationSender {

    @Override
    public void send(String msj) {

        System.out.println("EmailSend  "  + msj);

    }
}
