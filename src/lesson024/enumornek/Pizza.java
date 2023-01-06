package lesson024.enumornek;

public class Pizza {

	
	 Boy boy;
	 int fiyat;
	 String[] malzemeler;
	 Tur tur;
	 HamurTipi hamurTipi;
	 
	public Pizza(Boy boy, Tur tur, HamurTipi hamurTipi) {
		super();
		this.boy = boy;
		this.tur = tur;
		this.hamurTipi = hamurTipi;
	}

	@Override
	public String toString() {
		return "Pizza [boy=" + boy + ", fiyat=" + fiyat + ", tur=" + tur + ", hamurTipi=" + hamurTipi + "]";
	}
	
	 
	
}
