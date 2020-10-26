package Interface1;


public class Werewolf implements Monster{
    
    private String name;
    
    public Werewolf(String n){
        name = n;
    }
    @Override
    public void attack() {
        System.out.println("Werewolf claws at your back");
    }

    @Override
    public void identify() {
        System.out.println("Hi im " + name + " the werewolf");
    }
    
}