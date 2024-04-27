public class getteR {
    public static float pi = 3.14f;
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        //c1.radius = 20;
        System.out.println(c1.Area());
        System.out.println(c1.getradius());
    }
}

class Circle {
    private int radius;
    public Circle(int r) {
        this.radius = r;
    }
    public float Area (){
        return getteR.pi * radius * radius; 
    }

    public int getradius(){
        return this.radius;
    }
}
