package Domaci5;

import java.io.File;
import java.io.PrintWriter;

public class Televizor extends KucniAparat {
	private int brPrograma = 1;
	public Televizor(String aMarka,String aModel,Boolean aUkljucen,int aBrPrograma) throws KucniAparatException {
		super(aMarka,aModel,aUkljucen);
		
		if((aBrPrograma>0 && aBrPrograma<=40) && aModel!=null && aMarka!=null) {
			this.brPrograma = aBrPrograma;			
		}else {
			throw new KucniAparatException("Kanal mora biti izmedju 1 i 40");
		}
	
	} 
	
	public void promeniProgramNavise() {
		this.brPrograma++;
		if(this.brPrograma>40) {
			this.brPrograma=1;
		}
	}
	
	public void promeniProgramNanize() {
		this.brPrograma--;
		if(this.brPrograma<1) {
			this.brPrograma=40;
		}
	}
	@Override
	public void ispisi() {
		try {
			File f = new File("filesdz4/televizor.txt");
			f.delete();
			if(f.createNewFile()) {
				PrintWriter p = new PrintWriter(f);
				p.print(this.getMarka()+"\t");
				p.print(this.getModel()+"\t");
				p.print(this.isUkljucen()+"\t");
				p.print(this.brPrograma);
				p.flush();
				p.close();
				System.out.println("Uspesno upisivanje!"+this.getClass().getSimpleName());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
