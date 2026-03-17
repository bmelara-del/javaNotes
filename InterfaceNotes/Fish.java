package InterfaceNotes;


public class Fish implements Prey, Predator { // to implement multiple interfaces
    
    @Override
    public void flee(){
        System.out.println("This fish is fleeing from a larger fish");
    }

    @Override
    public void hunt(){
        System.out.println("This fish is hunting a larger fish");
    }
}
