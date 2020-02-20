
package Tira0604_Binaarihakupuu;

// tässä puussa voi lisätä suoraan oikeaan tai vasempaan 
public class toinenPuu {
    private Solmu juuri;
    
    public toinenPuu() {
        this.juuri = null;
    }
    
    public void lisaaJuuri(Solmu solmu) {
            this.juuri = solmu;
    }
    
    public void lisaa(Solmu vanhempi, Solmu lisattava, String paikka) {
        if (paikka.equals("o")) {
            vanhempi.setOikea(lisattava);
        }
        if (paikka.equals("v")) {
            vanhempi.setVasen(lisattava);
        }
    }
    
    public Solmu getJuuri() {
        return this.juuri;
    }
    
    public void tulostaEsijarjestys(Solmu solmu) {
        if (solmu == null) {
            return;
        }
        System.out.print(solmu.avain() + " ");
        tulostaEsijarjestys(solmu.getVasen());
        tulostaEsijarjestys(solmu.getOikea());
    }
    
    public int pienin(Solmu solmu, int n) {
        
        if (solmu == null) {
            return n;
        }
        
        if (solmu.getVasen() != null && solmu.getVasen().avain() < n) {
            n = solmu.getVasen().avain();
        }
        
        if (solmu.getOikea() != null && solmu.getOikea().avain() < n) {
            n = solmu.getOikea().avain();
        }
        
        pienin(solmu.getOikea(), n);
        pienin(solmu.getVasen(), n);
        
        return n;
    }
}
