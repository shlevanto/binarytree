package Tira0604_Binaarihakupuu;


public class Puu {
    private Solmu juuri;
    
    public Puu () {
        this.juuri = null;
    }
    
    // luentomonisteen pseudokoodiesimerkin mukaisesti
    public Solmu lisaa(int avain, String data) {
        if (this.juuri == null) {
            this.juuri = new Solmu(avain, data, null, null, null);
        }
        
        else {
            Solmu solmu = this.juuri;
            Solmu edellinenSolmu = null;
                     
            while (solmu != null && solmu.avain() != avain) {
                edellinenSolmu = solmu;
                if (avain < solmu.avain()) {
                    solmu = solmu.getVasen();
                } else {
                    solmu = solmu.getOikea();
                }
            }
            
            if (solmu == null) {
                solmu = new Solmu(avain, data, null, null, edellinenSolmu);
                
                if (avain < edellinenSolmu.avain()) {
                    edellinenSolmu.setVasen(solmu);
                } else {
                    edellinenSolmu.setOikea(solmu);
                }
                return solmu;
            }
            
        }   
        return null;
    }
    
    // lasketaan jonkin tietyn solmun korkeus
    public int korkeus(Solmu solmu) {
        // lasketaan puun korkeus
        if (solmu == null) {
            return - 1;
        }
        
        return 1 + Math.max(korkeus(solmu.getVasen()), korkeus(solmu.getOikea()));
    }
    
    public Solmu getJuuri() {
        return this.juuri;
    }
    
    public Solmu etsiAvain (int a, Solmu solmu) {
        if (solmu == null || solmu.avain() == a) {
            return solmu;
        } 
        
        if (a < solmu.avain()) {
            return etsiAvain(a, solmu.getVasen());
        } else {
            return etsiAvain(a, solmu.getOikea());
        }
    }

    
    // tulostustoiminnot
    
    public void tulostaEsijarjestys(Solmu solmu) {
        if (solmu == null) {
            return;
        }
        System.out.print(solmu + " ");
        tulostaEsijarjestys(solmu.getVasen());
        tulostaEsijarjestys(solmu.getOikea());
    }
    
    public void tulostaSisajarjestys(Solmu solmu) {
        if (solmu == null) {
            return;
        }
        tulostaSisajarjestys(solmu.getVasen());
        System.out.print(solmu + " ");
        tulostaSisajarjestys(solmu.getOikea());
    }
    
    public void tulostaJalkijarjestys(Solmu solmu) {
        if (solmu == null) {
            return;
        }
        tulostaJalkijarjestys(solmu.getVasen());
        tulostaJalkijarjestys(solmu.getOikea());
        System.out.print(solmu + " ");
    }
    

    
    
        
}
