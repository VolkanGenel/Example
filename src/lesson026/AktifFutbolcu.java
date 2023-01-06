package lesson026;

public abstract class AktifFutbolcu extends Futbolcu {

	public AktifFutbolcu(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		// TODO Auto-generated constructor stub
	}

	public boolean pasVer(){
		int pasSkor = pasSkor();
		System.out.println("passkoru= "+ pasSkor);
		if(pasSkor>68) {
			System.out.println("Başarılı Pas");
			return true;
		} else {
			System.out.println("Başarısız Pas");
            return false;
		}
	};
	
	public abstract int pasSkor();
	public abstract int golSkor(int kurtaris);
	
	
}
