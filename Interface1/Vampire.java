package Interface1;


public class Vampire implements Monster{
    
    private String name;
    
    public Vampire(String n){
        name = n;
    }

    @Override
    public void attack() {
        System.out.println("Vampire is biting your neck");
    }

    @Override
    public void identify() {
        System.out.println("I am" + name + "the monster");
    }
    
    public void Changetobat(){
        System.out.println("Vampire changes into a bat");
    }
    
}
