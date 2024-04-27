public class construct {
    public static void main(String[] args) {
        Circle c1 = new Circle(10f);
        System.out.println(c1.area());
    }
}

class Circle {
    public float radius;
    public Circle (float r){
        this.radius = r;
    }
    public float area (){
        return 3.14f * this.radius *this.radius;
    }
}
