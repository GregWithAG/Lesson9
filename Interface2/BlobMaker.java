
package Interface2;

public class BlobMaker {


    public static void main(String[] args) {
        Blob a,b,c;
        a = new Blob("Joey");
        b = new Blob("Frankie");
        c = new Blob("Bob");
        
        System.out.println("My " + Blob.getblobcount() + " blobs are: ");
        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());
        System.out.println("C will tell me how many: " + c.getblobcount);
    }
    
}
