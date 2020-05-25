package Domaci3;

public class KoncertnaDvorana {

    //atributi i inicijalizacija niza pomocu statickog atributa kapacitet

    private static int KAPACITET = 300;
    boolean[] nizSedista = new boolean[KAPACITET];

    //konstruktor koji inicijalizuje sva sedista na true

    public KoncertnaDvorana() {
        for (int i = 0; i < nizSedista.length; i++) {
            nizSedista[i] = true;
        }
    }

    //metoda uvedi gledaoca
    public void uvediGledaoca(int aBrojSedista) {
        if (aBrojSedista > 300 && aBrojSedista < 0) {
            System.out.println("Unesite broj do 300");
        } else if (nizSedista[aBrojSedista] == false) {
            System.out.println("Sediste je zauzeto");

        } else {
            nizSedista[aBrojSedista] = false;
            System.out.println("Gledalac je uveden");

        }
    }

    public boolean proveraIsplativosti() {
        boolean status = false;
        int prviDeo = 0, drugiDeo = 0, ukupno = 0;
        //izracunaj za prvi deo 
        for (int i = 0; i < KAPACITET / 2; i++) {
            if (nizSedista[i] == false) {
                prviDeo++;
            }
        }
        //izracunavamo drugi deo
        for (int i = KAPACITET / 2; i < KAPACITET; i++) {
            if (nizSedista[i] == false) {
                drugiDeo++;
            }
        }
        //ukuono zauzetih mesta 
        ukupno = prviDeo + drugiDeo;

        if (prviDeo > ((KAPACITET / 2) * 50) / 100) {
            if (drugiDeo > ((KAPACITET / 2) * 40) / 100) {
                if (ukupno > ((KAPACITET) * 55) / 100) {
                    status = true;
                }
            }
        }
        return status;
    }
    
    public void slobodnaMestaPoSvakomRedu(){
    boolean[][] redovi = new boolean[KAPACITET/10][10];
    int brojac=0;
    for(int i=0;i<KAPACITET/10;i++){
        int brojSlobodnihSedista=0;
        for(int j=0;j<10;j++){
            if(this.nizSedista[brojac]==true){
            brojac++;
            brojSlobodnihSedista++;}else {
            	  brojac++;
            }
          
        }
        System.out.println("U redu br "+i+" ima "+brojSlobodnihSedista+" slobodnih sedista");
    }
    }

}