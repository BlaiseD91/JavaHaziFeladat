
package osztalyok;

/**
 *
 * @author Sz�kely Bal�zs
 */
public class Szamitogep {
    private double szabadMemoria;
    private boolean bekapcsolva;

    public Szamitogep(double szabadMemoria, boolean bekapcsolva) {
        this.szabadMemoria = szabadMemoria;
        this.bekapcsolva = bekapcsolva;
    }

    public Szamitogep() {
        this(1024, false);
    }
    
    
}
