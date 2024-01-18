package Classes;

public class Car {

    public void setColor(Color color) {
        this.color = color;
    }

    public Color color = Color.GRAY;

    Car() {
    }

    public Car(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                '}';
    }
}
