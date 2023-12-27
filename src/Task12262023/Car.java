package Task12262023;

public class Car extends Vehicle{



    private String name;
    private  int currentSpeed;

    public int getSpeed() {
        return currentSpeed;
    }

    public void setSpeed(int speed) {
        this.currentSpeed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void getFuelType() {
        System.out.println("CAR");
    }
}
