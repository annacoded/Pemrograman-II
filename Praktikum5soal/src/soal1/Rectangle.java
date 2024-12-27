package soal1;

public class Rectangle extends Shape{
    private final double length; // panjang dalam satuan tertentu
    private final double width;  // lebar dalam satuan tertentu

    //----------------------------------
    // Constructor: Sets up the rectangle.
    //----------------------------------
    public Rectangle(double l, double w) {
        super("Rectangle");
        length = l;
        width = w;
    }

    //-----------------------------------------
    // Returns the area of the rectangle.
    //-----------------------------------------
    @Override
    public double area() {
        return length * width;
    }

    //-----------------------------------
    // Returns the rectangle as a String.
    //-----------------------------------
    @Override
    public String toString() {
        return super.toString() + " with length " + length + " and width " + width;
    }
}
