package Interface1;

public class Zombie implements Monster{

    private String name;
    
    public Zombie(String n){
        n = name;
    }
    @Override
    public void attack() {
        System.out.println("Zombie is eating your brain");
    }

    @Override
    public void identify() {
        System.out.println("I am " + name + " the zombie");
    }
    
}
