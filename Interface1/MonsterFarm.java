
package Interface1;

public class MonsterFarm {


    public static void main(String[] args) {
        Monster x[] = new Monster[6];
        
        for (int i = 0; i < 6; i++) {
            if(i<2){
                x[i] = new Vampire(" DIO " + (i+1));
            }
            else if(i<4){
                x[i] = new Werewolf("Buson " + (i+1));
            }
            else{
                x[i] = new Vampire("Franklin " + (i+1));
            }
        }
        for (int i = 0; i < 6; i++) {
            x[i].identify();
            x[i].attack();
            if(x[i] instanceof Vampire)
                ((Vampire)x[i]).Changetobat();
        }
        
    }
    
}
