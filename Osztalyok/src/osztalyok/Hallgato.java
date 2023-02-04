
package osztalyok;

/**
 *
 * @author Sz�kely Bal�zs
 * 
 * 3. feladat - Hallgat� oszt�ly megval�s�t�sa
 */
public class Hallgato {
    
    private String azonosito;
    private int evfolyam;
    private int kreditszam;

    public Hallgato(String azonosito, int evfolyam, int kreditszam) {
        this.azonosito = azonosito;
        this.evfolyam = evfolyam;
        this.kreditszam = kreditszam;
    }

    public Hallgato(String azonosito) {
        this(azonosito, 1, 0);
    }
    
    public void targyFelvesz(int kreditertek){
        this.kreditszam += kreditertek;
    }
    
    public boolean vizsgazik(){
        boolean sikeres = false;
        if(this.kreditszam > 0 ){
            sikeres = true;
            this.kreditszam = 0;
            this.evfolyam++;
        }
        return sikeres;
    }
    
    
    
}
