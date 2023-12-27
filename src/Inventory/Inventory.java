package Inventory;

public class Inventory {
    private int id = 0;
    private String name;
    private int price;
    private  int quantity;

    public Inventory(){
        setId(getId() + 1);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {this.id = id;}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void restocking (int amount){
        setQuantity(getQuantity() + amount);
        print();
    }
    public void sell (int quantity) {
        if(quantity <= getQuantity())
            setQuantity(getQuantity() - quantity);
        else{
            throw  new RuntimeException("Stockda bu qeder mehsul yoxdur");
        }
        print();
    }
    public void print (){
        System.out.println("Id   ---   " +getId());
        System.out.println("Name   ---   " +getName());
        System.out.println("Price   ---   " +getPrice());
        System.out.println("Quantity   ---   " +getQuantity());
    }

}
