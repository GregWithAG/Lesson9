package Interface2;
/*
static variables: are not instance variables,
which apply to an individual object. They are
Class Level variables that apply to the entire
class.

static methods: abilities of the entire class 
and not of an individual object/instance. these
are run throughout the class itself and not the object.
*/
public class Blob {
    private String name;
    private static int Blobcount;
    
    public Blob(String n){
        name = n;
        Blobcount ++;
    }
    
    public String getName(){
        return name;
    }
    public static int getblobcount(){
        return Blobcount;
    } 
}