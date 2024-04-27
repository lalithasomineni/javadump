public class constSetter {
    // Define a constant for pi
    public static float pi = 3.14f;

    public static void main(String[] args) {
        // Create a Circle object with radius 20
        Circle c1 = new Circle(20);
        
        // Print the area of the circle
        System.out.println("Area of the circle: " + c1.Area());
        
        // Print the current radius of the circle
        System.out.println("Current radius: " + c1.getradius()); 
        
        // Set the radius of the circle to 10
        c1.setradius(10);
        
        // Print the new area of the circle after radius change
        System.out.println("Area after radius change: " + c1.Area());  
        
        // Print the new radius of the circle
        System.out.println("New radius: " + c1.getradius()); 
    } 
}

class Circle {
    private int radius; // Declare a private field for radius

    // Constructor to initialize the radius
    public Circle(int r) {
        setradius(r); // Call the setradius method to set the radius
    }

    // Method to calculate the area of the circle
    public float Area() {
        return constSetter.pi * radius * radius; // Use the pi constant to calculate area
    }

    // Getter method to retrieve the radius
    public int getradius() {
        return this.radius;
    }

    // Setter method to set the radius, with validation to ensure it's positive
    public void setradius(int r) {
        if(r > 0) { // Check if the radius is positive
            this.radius = r; // Set the radius
        }
    }
}
