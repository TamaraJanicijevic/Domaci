package Domaci2;
//pozivanje klase Scanner

import java.util.Scanner;

public class TamaraJanicijevic {

    String recenica;

    public void unesiRecenicu() {
        try {
            System.out.println("Unesi recenicu:");
            //pravljenje objekta skener
            Scanner sc = new Scanner(System.in);
            this.recenica = sc.nextLine();
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//metoda za prebrojavanje najfrekventnijeg karaktera

    public void prebrojNajfrekventnijiKarakter() {
        char[] karakteri = this.recenica.toCharArray();
        StringBuilder uniformniNiz = new StringBuilder();
        char najf = karakteri[0];
        int najv = 0;
        int freq = 0;

        for (int i = 0; i < karakteri.length; i++) {
            if (!uniformniNiz.toString().contains(recenica.charAt(i) + "")) {
                uniformniNiz.append(recenica.charAt(i) + "");
                for (int j = 0; j < karakteri.length; j++) {
                    if (karakteri[j] == karakteri[i]) {
                        freq++;

                    } else {

                        continue;
                    }
                }
                //  System.out.println("Freq: "+freq+"  :Najv"+najv);
                if (freq > najv) {
                    najv = freq;
                    najf = karakteri[i];
                    freq = 0;
                }
            }

            if (i < uniformniNiz.length()) {
                System.out.println(uniformniNiz.charAt(i) + ":" + freq);

            } else {
                continue;
            }

        }
        // System.out.println(uniformniNiz);
        System.out.println("Karakter koji se najvise puta ponavlja je: " + najf + " :" + najv);
    }

}
