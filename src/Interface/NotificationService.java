package Interface;

public class NotificationService {

    private NotificationSender notificationSender;
   public void send(String msj){
       notificationSender.send(msj);
   }
    public NotificationSender getNotificationSender() {
        return notificationSender;
    }
    public void setNotificationSender(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }
    public NotificationService(NotificationSender notificationSender){
        setNotificationSender(notificationSender);
    }
}
