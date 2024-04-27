public class ideaOfclasses {
    public static float radius = 10f;
    public static int length = 10;
    public static void main(String[] args) {
      System.out.println(circle.Area(radius));
      System.out.println(square.Area(length));

    }
}

class circle {
    public static float Area(float radius) {
        return 3.14f*radius;
    }
}
class square {
    public static float Area(int length) {
        return length*length;
    }
}


