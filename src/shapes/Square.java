package shapes;

public class Square extends Quadrilateral {
    protected int side;

    public Square(int side) {
        super(side, side);

    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void setWidth(int width) {
        this.setLength(width);
    }

}

//    public Square(int side) {
//        super(side, side);
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * super.length;
//    }
//
//    @Override
//    public int getArea() {
//        return (int) Math.pow(super.length, 2);
//    }



