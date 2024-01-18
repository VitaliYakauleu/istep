package Classes;
public class Demo {
    public static void main(String[] args) {
        Pen pen = new Pen(Color.RED);

        //класс, объект, имя конструктора
        System.out.println(pen);

        Car car = new Car();
      //  car.color = Color.RED;
        car.setColor(Color.BLUE);
        System.out.println(car);

        Apple apple = new Apple();
    }

}

enum Color { // перечисление
    BLACK, RED, GREEN, BLUE, YELLOW, WHITE, GRAY;
}


