public class settR2 {
    public static void main(String[] args) {
               
       Person p1 = new Person();
       p1.setName("Ankit");
       System.out.println(p1.getName());
    }
}

class Person {
    private String name;
    public String getName() {
        return name;
    }
    
    // Declare a setter method here
    public void setName(String n){
        this.name = n;
    }
 }
 
