package lesson025.odev.cozum;

public class Menu {

private	EYemek yemek;
private	ECorba corba;
private EIcecekler icecek;
private	ETatli tatli;
	
	public Menu(EYemek yemek, ECorba corba, EIcecekler icecek, ETatli tatli) {
		super();
		this.yemek = yemek;
		this.corba = corba;
		this.icecek = icecek;
		this.tatli = tatli;
	}

	public Menu() {
		super();
	}

	@Override
	public String toString() {
		return "Menu [yemek=" + yemek + ", corba=" + corba + ", icecek=" + icecek + ", tatli=" + tatli + "]";
	}

	public EYemek getYemek() {
		return yemek;
	}

	public void setYemek(EYemek yemek) {
		this.yemek = yemek;
	}

	public ECorba getCorba() {
		return corba;
	}

	public void setCorba(ECorba corba) {
		this.corba = corba;
	}

	public EIcecekler getIcecek() {
		return icecek;
	}

	public void setIcecek(EIcecekler icecek) {
		this.icecek = icecek;
	}

	public ETatli getTatli() {
		return tatli;
	}

	public void setTatli(ETatli tatli) {
		this.tatli = tatli;
	}
	
}
