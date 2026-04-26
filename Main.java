public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Square();
        Shape s3 = new Triangle();

        System.out.println("--- Shape Drawer System ---\n");

        s1.draw();
        s2.draw();
        s3.draw();
    }
}