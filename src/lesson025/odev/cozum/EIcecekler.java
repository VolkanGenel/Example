package lesson025.odev.cozum;

public enum EIcecekler {

	AYRAN(false),KOLA(false),FANTA(false),GAZOZ(false),
	SU(false),ICETEA(false),SALGAM(false);
	boolean atandimi;

	EIcecekler(boolean atandimi) {
		this.atandimi = atandimi;
	}

	public boolean isAtandimi() {
		return atandimi;
	}

	public void setAtandimi(boolean atandimi) {
		this.atandimi = atandimi;
	}
	
}
