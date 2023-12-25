 public class Car {
    private int year;
    private String brand;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public  void displayInfo() {
        System.out.println("Brand    " +getBrand() );
        System.out.println("Year    " +getYear() );
    }
}