
package humancomputerproject;


public class Computer extends Entity {
    
   private final int ram;

    public Computer(int ram, String name, double w, int y) {
        super(name, w, y);
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public String getName() {
        return name;
    }

    public double getW() {
        return w;
    }

    public int getY() {
        return y;
    }

    @Override
    public void displayInfo() {
        System.out.println("Computer Information");
        super.displayInfo(); 
         System.out.println("RAM:" + ram);
    }
    
    }
    
    

