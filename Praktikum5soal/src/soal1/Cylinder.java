package soal1;

public class Cylinder extends Shape {
    private final double radius; // jari-jari dalam satuan tertentu
    private final double height; // tinggi dalam satuan tertentu

    //----------------------------------
    // Constructor: Sets up the cylinder.
    //----------------------------------
    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    //-----------------------------------------
    // Returns the surface area of the cylinder.
    //-----------------------------------------
    @Override
    public double area() {
        return Math.PI * (radius*radius) * height;
    }

    //-----------------------------------
    // Returns the cylinder as a String.
    //-----------------------------------
    @Override
    public String toString() {
        return super.toString() + " with radius " + radius + " and height " + height;
    }
}
