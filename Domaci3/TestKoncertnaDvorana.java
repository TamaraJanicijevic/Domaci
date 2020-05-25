package Domaci3;

public class TestKoncertnaDvorana {

	public static void main(String[] args) {
		KoncertnaDvorana a = new KoncertnaDvorana();
		a.uvediGledaoca(21);
		a.uvediGledaoca(23);
		a.uvediGledaoca(24);
		System.out.println(a.proveraIsplativosti());
		a.slobodnaMestaPoSvakomRedu();

	}

}
