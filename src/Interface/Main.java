package Interface;

import interface2.Interface;

public class Main {

    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService( new EmailSender());
        notificationService.send("salam");
    }
}