package bicycle;

public class Bicycle {

    private int speed ;
    private  int gear;

    private Wheel wheel;

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(String model,int size ,Colors color) {
        Wheel wheel = new Wheel();
        wheel.setModel(model);
        wheel.setColor(Colors.Black);
        wheel.setSize(size);
        this.wheel = wheel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public Bicycle(){

    }

    public Bicycle(int speed , int gear){
            setGear(gear);
            setSpeed(speed);
    }

    public void setGear(int gear) {

        if(gear < 6)
        this.gear = gear;
        else{
            throw  new RuntimeException("6 dan asagi olmalidir");
        }
    }
    public void print () {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "speed=" + speed +
                ", gear=" + gear +
                ", wheel=" + wheel +
                '}';
    }
}
