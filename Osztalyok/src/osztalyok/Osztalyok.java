
package osztalyok;

/**
 *
 * @author Sz�kely Bal�zs
 */
public class Osztalyok {


    public static void main(String[] args) {
        //2. feladat megval�s�t�s�nak ellen�rz�se
        System.out.println("2. feladat:");
        
        Szamitogep sz1 = new Szamitogep();
        Szamitogep sz2 = new Szamitogep(2048, false);
        
        sz1.kapcsol();
        
        if(sz1.programMasol(800)) System.out.println("A 800 MB-os program m�sol�sa sikeres volt.");
        else System.out.println("Sikertelen m�sol�s");
        if(sz1.programMasol(400)) System.out.println("A 400 MB-os program m�sol�sa sikeres volt.");
        else System.out.println("Sikertelen m�sol�s");
        if(sz2.programMasol(1)) System.out.println("Az 1 MB-os program m�sol�sa sikeres volt.");
        else System.out.println("Sikertelen m�sol�s");
        
        System.out.println(sz1);
        System.out.println(sz2);
        
        //3. feladat megval�s�t�s�nak ellen�rz�se
        System.out.println("\n3. feladat:");
        
        Hallgato h1 = new Hallgato("C66533");
        Hallgato h2 = new Hallgato("P12K78", 2,12);
        
        h2.targyFelvesz(3);
        
        if(h1.vizsgazik()) System.out.println("A hallgat� sikeresen vizsg�zott!");
        else System.out.println("A vizsga sikertelen volt");
        if(h2.vizsgazik()) System.out.println("A hallgat� sikeresen vizsg�zott!");
        else System.out.println("A vizsga sikertelen volt");
    }
    
}
