package Domaci5;

import java.io.File;
import java.io.PrintWriter;

public class KucniAparat {

	private String marka, model;
	private Boolean ukljucen;

	public KucniAparat(String aMarka, String aModel, Boolean aUkljucen) throws KucniAparatException {
		if (aMarka != null && aModel != null && aUkljucen != null) {
			this.marka = aMarka;
			this.model = aModel;
			this.ukljucen = aUkljucen;

		} else {
			throw new KucniAparatException("Neispravan unos");
		}

	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) throws KucniAparatException {
		if (marka != null) {
			this.marka = marka;
		} else {
			throw new KucniAparatException("Postavljanje marke mora biti u String formatu");
		}

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) throws KucniAparatException {
		if (model != null) {
			this.model = model;
		} else {
			throw new KucniAparatException("Postavljanje modela mora biti u String formatu");
		}

	}

	public boolean isUkljucen() {
		return ukljucen;
	}

	public void setUkljucen(boolean ukljucen) {
		this.ukljucen = ukljucen;
	}
	// metoda za ispisivanje text fajla

	public void ispisi() {
		try {
			File f = new File("filesdz4/marka_model.txt");
			f.delete();
			if (f.createNewFile()) {
				PrintWriter p = new PrintWriter(f);
				p.print(this.marka + "\t"); // priprema
				p.print(this.model + "\t"); // priprema
				p.print(this.ukljucen); // priprema
				p.flush(); // printaj
				p.close();
				System.out.println("Uspesno upisivanje!"+this.getClass().getSimpleName());
			}

		} catch (Exception e) {
			System.out.println("Neuspesno");
			System.out.println(e.getMessage());
		}

	}

}
