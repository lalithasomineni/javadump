public class priavteMthd {
    public static float pi = 3.14f;
    public static void main(String[] args) {
        Circle c1 = new Circle (12);
        System.out.println(c1.squareRad(12));
    }
}

class Circle {
    private int radius; // Declare a private field for radius

    // Constructor to initialize the radius
    public Circle(int r) {
        this.radius = r;
    }

    private int squareRad(int radius){
        return radius * radius;
    }

    // Method to calculate the area of the circle
    public float Area() {
        return priavteMthd.pi * squareRad(radius); // Use the pi constant to calculate area
    }

    // Getter method to retrieve the radius
    public int getradius() {
        return this.radius;
    }

    // Setter method to set the radius, with validation to ensure it's positive
    public void setradius(int r) {
        if(r > 0) {
            this.radius = r;
        }
    }
}