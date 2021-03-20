package training2.optional.inheritance;

public class Square extends Rectangle{

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }


    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + super.getLength() +", which is a subclass of " + super.toString();
    }
}
