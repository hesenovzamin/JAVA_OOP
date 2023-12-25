package Vehicle;

public class Vehicle {
    private  String model ;
    private  int year ;
    private  int currentSpeed = 0;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void start () {

        System.out.println("Start Vehicle");
    }

    public void stop () {

        setCurrentSpeed(0);

        printCurrentSpeed ();
    }

    public void gas () {

        setCurrentSpeed(getCurrentSpeed() + 20);
        printCurrentSpeed ();
    }
    public void printCurrentSpeed (){
        System.out.println(getCurrentSpeed());
    }



}
