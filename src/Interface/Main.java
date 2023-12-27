package Interface;

public class Main {

    public static void main(String[] args) {


        NotificationService notificationService = new NotificationService(new SmsSender());
        notificationService.send("Salam");

    }
}