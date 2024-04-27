public class defConstruct {
    public static void main(String[] args) {
       Circle c1 = new Circle();
       System.out.println(c1.area()); 
    }
}
class Circle {
    public float radius;
    public float area (){
        return 3.14f * radius * radius;
    }
}