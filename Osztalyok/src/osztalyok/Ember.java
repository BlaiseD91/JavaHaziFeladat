
package osztalyok;

/**
 *
 * @author Sz�kely Bal�zs
 * 
 * 5. feladat - Ember oszt�ly megval�s�t�sa
 */
public class Ember {
    
    private String vezeteknev;
    private String kresztnev;
    private int szuletesiEv;

    public Ember(String vezeteknev, String kresztnev, int szuletesiEv) {
        this.vezeteknev = vezeteknev;
        this.kresztnev = kresztnev;
        this.szuletesiEv = szuletesiEv;
    }
    
    public String hogyHivjak(){
        return this.vezeteknev+" "+this.kresztnev;
    }
    
}
