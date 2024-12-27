package soal1;

public abstract class Shape {
    private final String name;

    // Constructor
    public Shape(String name){
        this.name = name;
    }

    //Abstract method to calculate area
    public abstract double area();

    // toString method
    @Override
    public String toString(){
        return "Shape name: " + name;
    }
}
