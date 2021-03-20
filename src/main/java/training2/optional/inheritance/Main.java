package training2.optional.inheritance;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("blue", true, 2.0);
        System.out.println(c.getArea());
        System.out.println(c);

        Rectangle r = new Rectangle("purple", false, 1.5,2.0);
        System.out.println(r.getPerimeter());
        System.out.println(r);

        Square s = new Square("white", false, 3.0);
        s.setLength(2);
        System.out.println(s);
    }
}
