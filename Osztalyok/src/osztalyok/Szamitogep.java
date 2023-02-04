
package osztalyok;

/**
 *
 * @author Sz�kely Bal�zs
 * 
 * //2. feladat - Sz�m�t�g�p oszt�ly megval�s�t�sa
 */
public class Szamitogep {
    
    //adattagok
    private double szabadMemoria;
    private boolean bekapcsolva;

    //konstruktorok
    public Szamitogep(double szabadMemoria, boolean bekapcsolva) {
        this.szabadMemoria = szabadMemoria;
        this.bekapcsolva = bekapcsolva;
    }

    public Szamitogep() {
        this(1024, false);
    }
    
    //met�dusok

    @Override
    public String toString() {
        return "A sz�m�t�g�p szabad mem�ri�ja: "+this.szabadMemoria+"MB �s jelenleg "+(this.bekapcsolva? "be van kapcsolva":"nincs bekapcsolva");
    }
    
    
    
    public void kapcsol(){
        if(this.bekapcsolva) this.bekapcsolva = false;
        else this.bekapcsolva = true;
    }
    
    public boolean programMasol(double programMeret){
        boolean siker = false;
        if(this.bekapcsolva && (this.szabadMemoria >= programMeret)){
            this.szabadMemoria -= programMeret;
            siker = true;
        }
        return siker;
    }
    
    
    
}
