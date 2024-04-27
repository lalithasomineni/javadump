public class privatAcess {
    public static final float pi = 3.14f;
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        c1.radius = 20;
        System.out.println(c1.Area());
        System.out.println(c1.radius);

    }
}

class Circle {
    private int radius;
    public Circle(int r) {
        this.radius = r;
    }
    public float Area (){
        return privatAcess.pi * radius * radius; 
    }
}
