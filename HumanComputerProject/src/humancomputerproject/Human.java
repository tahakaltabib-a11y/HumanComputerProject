
package humancomputerproject;


public class Human extends Entity{
    private final String job;    

    public Human(String job, String name, double w, int y) {
        super(name, w, y);
        this.job = job;
    }

    public String getJob() {
        return job;
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
        System.out.println("Human Information");
        super.displayInfo(); 
        System.out.println("Job:" + job);
    }


    
    
}
