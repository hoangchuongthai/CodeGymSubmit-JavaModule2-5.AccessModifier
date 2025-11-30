import src.Circle;

public class App {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("Radius c1 = " + c1.getRadius());
        System.out.println("Area c1 = " + c1.getArea());

        // Tạo đối tượng bằng constructor có tham số
        Circle c2 = new Circle(5.0);
        System.out.println("Radius c2 = " + c2.getRadius());
        System.out.println("Area c2 = " + c2.getArea());

    }
}
