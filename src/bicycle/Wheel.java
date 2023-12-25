package bicycle;


enum Colors {
    Yellow,
    Black,
    White
}
public class Wheel {
    private String model;
    private int size;

    private Colors color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "model='" + model + '\'' +
                ", size=" + size +
                ", color=" + color +
                '}';
    }
}
