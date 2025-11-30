import src.Student;

public class App {
    public static void main(String[] args) {

        Student student = new Student();

        System.out.println("Du lieu hoc sinh truoc ghi gan: " + student.toString());

        // Ghi dữ liệu thông qua setter
        student.setName("Alice");
        student.setClasses("C03");

        System.out.println("\nDa gan gia tri cho student bang setter!");
        System.out.println(student.toString());
    }
}

