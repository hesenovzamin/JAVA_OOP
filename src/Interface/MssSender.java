package Interface;

public class MssSender implements NotificationSender {
    @Override
    public void send(String msj) {
        System.out.println("MssSend "  + msj);
    }
}
