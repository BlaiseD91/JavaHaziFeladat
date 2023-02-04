
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
        
        System.out.println(h1);
        System.out.println(h2);
        
        //4. feladat megval�s�t�s�nak ellen�rz�se
        System.out.println("\n4. feladat:");
        
        Torta t1 = new Torta();
        Torta t2 = new Torta(3, true);
        
        if(t1.kremmelMegken()) System.out.println("A tort�t megkented.");
        else System.out.println("A ken�s sikertelen.");
        if(t1.kremmelMegken()) System.out.println("A tort�t megkented.");
        else System.out.println("A ken�s sikertelen.");
        
        t2.ujEmelet();
        
        System.out.println(t1);
        System.out.println(t2);
        
        //5. feladat megval�s�t�s�nak ellen�rz�se
        System.out.println("\n5. feladat:");
        
        Ember szemely = new Ember("Sz�kely", "Bal�zs", 1991);
        System.out.println(szemely.hogyHivjak());
        
        //6. feladat megval�s�t�s�nak ellen�rz�se
        System.out.println("\n6. feladat:");
    
        Harcos harcos1 = new Harcos("BlaiseDamn", 250, 25);
        Harcos harcos2 = new Harcos("Anubis", 150, 35);
        
        System.out.println(harcos1);
        System.out.println(harcos2);
        
        boolean valakiVesztett = false;
        while(!valakiVesztett){
            valakiVesztett = harcos1.harcol(harcos2);
        }
        System.out.println(harcos1);
        System.out.println(harcos2);
    }
    
}
