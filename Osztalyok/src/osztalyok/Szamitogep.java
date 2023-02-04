
package osztalyok;

/**
 *
 * @author Székely Balázs
 * 
 * //2. feladat - Számítógép osztály megvalósítása
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
    
    //metódusok

    @Override
    public String toString() {
        return "A számítógép szabad memóriája: "+this.szabadMemoria+"MB és jelenleg "+(this.bekapcsolva? "be van kapcsolva":"nincs bekapcsolva");
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
