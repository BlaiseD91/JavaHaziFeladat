
package osztalyok;

/**
 *
 * @author Székely Balázs
 */
public class Osztalyok {


    public static void main(String[] args) {
        //2. feladat megvalósításának ellenõrzése
        System.out.println("2. feladat:");
        
        Szamitogep sz1 = new Szamitogep();
        Szamitogep sz2 = new Szamitogep(2048, false);
        
        sz1.kapcsol();
        
        if(sz1.programMasol(800)) System.out.println("A 800 MB-os program másolása sikeres volt.");
        else System.out.println("Sikertelen másolás");
        if(sz1.programMasol(400)) System.out.println("A 400 MB-os program másolása sikeres volt.");
        else System.out.println("Sikertelen másolás");
        if(sz2.programMasol(1)) System.out.println("Az 1 MB-os program másolása sikeres volt.");
        else System.out.println("Sikertelen másolás");
        
        System.out.println(sz1);
        System.out.println(sz2);
        
    }
    
}
