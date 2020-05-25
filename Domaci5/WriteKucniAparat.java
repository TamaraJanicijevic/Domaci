package Domaci5;

public class WriteKucniAparat {

	public static void main(String[] args) {
		
		 KucniAparat k = new KucniAparat("Philips", "SQ2", true);
		 Televizor t = new Televizor("LG", "LT33", false, 2);
		 Radio r = new Radio("Sony","SR",false,88.9);
		 k.setUkljucen(false);
		 t.setUkljucen(true);
		 t.promeniProgramNavise();
		 r.setUkljucen(true);
		 r.setFrekvencija(105.6);
		 k.ispisi();
		 t.ispisi();
		 r.ispisi();
	}

}
