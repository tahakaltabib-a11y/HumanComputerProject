
package humancomputerproject;

import java.util.ArrayList;


public class HumanComputerProject {

  
    public static void main(String[] args) {
        Human h = new Human("player football","taha",80,21);
        Computer c = new Computer(16,"Dell",2.5,3);
        ArrayList<Entity> list = new ArrayList<>();
        list.add(h);
        list.add(c);
        for(Entity   ob:list){
            ob.displayInfo();
        }
        
    }
    
}
