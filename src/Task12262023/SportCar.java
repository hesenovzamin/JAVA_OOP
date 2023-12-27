package Task12262023;

public class SportCar extends  Car{

    private boolean turbo ;
    public void turbo(){
        if(turbo){
            super.setSpeed(getSpeed() + 10);
        }
        else {
            super.setSpeed(getSpeed() + 5);
        }
    }
    public  void activateTurbo(){
        System.out.println("Sportcar");
    }
}
