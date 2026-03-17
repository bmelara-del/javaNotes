package InterfaceNotes;

public class Rabbit implements Prey {

    @Override // to show we are overriding the interface's flee method
    public void flee() { // needs to have no parameters to match the interface's flee method
        System.out.println("*The rabbit is fleeing*");
    }
    

    
}
