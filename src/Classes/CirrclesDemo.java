package Classes;

public class CirrclesDemo {
    public static void main(String[] args) {
        //вычислить длинну окружности и площадь круга
        double r1 = 1;
        double r2 = 2;
        double r3 = 3;

        double l1 = 2*Math.PI*r1;
        double s1 = Math.PI*r1*r1;
        double l2 = 2*Math.PI*r2;
        double s2 = Math.PI*r2*r2;
        double l3 = 2*Math.PI*r3;
        double s3 = Math.PI*r3*r3;
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r1,l1,s1);
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r2,l2,s2);
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r3,l3,s3);

        new Circle(r1).print(); //Анонимный
        System.out.println(Circle.desc);
    }
    static double calcLength(double r){
        return 2*Math.PI*r;
    }

    static double calcArea(double r){
        return Math.PI*r*r;
    }
}
class Circle{
    private double radius;
    private double length;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        calcLength(radius);
        calcArea(radius);
    }
public static String desc = "это окружность круга";
    public void calcLength(double radius){
        length = 2*Math.PI*radius;
    }

    public void calcArea(double radius){
        area = Math.PI*radius*radius;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return area;
    }

    public void print(){
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",radius,length,area);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", length=" + length +
                ", area=" + area +
                '}';
    }
}
