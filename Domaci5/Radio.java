package Domaci5;

import java.io.File;
import java.io.PrintWriter;

public class Radio extends KucniAparat {
 private double frekvencija = 87.5;
	
	public Radio(String aMarka, String aModel, Boolean aUkljucen,double aFrekvencija) throws KucniAparatException  {
		super(aMarka,aModel,aUkljucen);
		if(aFrekvencija>87.5 && aFrekvencija<108.0) {
			this.frekvencija = aFrekvencija;
		}else {
			throw new KucniAparatException("Frekvencija mora biti izmedju 87.5 i 108");
		}
		
	}

	public double getFrekvencija() {
		return frekvencija;
	}

	public void setFrekvencija(double aFrekvencija) throws KucniAparatException {
		if(aFrekvencija>87.5 && aFrekvencija<108.0) {
			this.frekvencija = aFrekvencija;
		}else {
			throw new KucniAparatException("Frekvencija mora biti izmedju 87.5 i 108");
		}
		this.frekvencija = aFrekvencija;
	}
	@Override
		public void ispisi() {
			try {
				File f = new File("filesdz4/radio.txt");
				f.delete();
				if(f.createNewFile()) {
					PrintWriter p = new PrintWriter(f);
					p.print(super.getModel()+"\t");
					p.print(super.getMarka()+"\t");
					p.print(super.isUkljucen()+"\t");
					p.print(this.frekvencija+"\t");
					p.flush();
					p.close();
					System.out.println("Uspesno upisivanje!"+this.getClass().getSimpleName());
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

}
