package lesson035;

public enum EUrun {

	Cips(20),Kola(25),Seker(30),Yag(90),Un(40),Ekmek(5),Cay(80),Yumurta(20) ,Yogurt(30), Sut(52);
	
	double fiyat;

	EUrun(double fiyat) {
		this.fiyat = fiyat;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
	
	
}
