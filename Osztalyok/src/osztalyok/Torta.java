
package osztalyok;

/**
 *
 * @author Székely Balázs
 *
 * 4. feladat - Torta osztály megvalósítása
 * */
public class Torta {
    private int emeletek;
    private boolean kenve;

    public Torta(int emeletek, boolean kenve) {
        this.emeletek = emeletek;
        this.kenve = kenve;
    }

    public Torta() {
        this(1, false);
    }

    @Override
    public String toString() {
        return this.emeletek+" emelet magas torta, "+(this.kenve ? "krémmel kenve, " : "nincs krémmel kenve, ")+this.mennyiKatona()+ "kcal";
    }
    
    
    
    public void ujEmelet(){
        this.emeletek++;
    }
    
    public boolean kremmelMegken(){
        boolean siker = false;
        if(!this.kenve){
            this.kenve = true;
            siker = true;
        }
        return siker;
    }
    
    public int mennyiKatona(){
        return this.kenve ? (this.emeletek * 1000 * 2) : (this.emeletek * 1000);
    }
    
    
}
