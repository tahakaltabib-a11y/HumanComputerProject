
package humancomputerproject;


public class Entity {
 protected String name;
 protected double w;
 protected int y;

    public Entity(String name, double w, int y) {
        this.name = name;
        this.w = w;
        this.y = y;
    }
    public void displayInfo(){
        System.out.println("Name:" + name);
        System.out.println("Weight:" + w);
        System.out.println("Year:" + y);
    }
}
