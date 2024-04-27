public class objectSquare {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.length = 10;
        System.out.println(s1.Area());
        Square s2 = new Square();
        s2.length = 1;
        System.out.println(s2.Area());
    }
}


class Square {
    public int length;
    public int Area () { return length * length;}
}