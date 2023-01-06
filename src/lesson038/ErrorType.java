package lesson038;

public enum ErrorType {

	DOLU_YER_SECIMI (1001,"Seçtiğiniz yer doludur"),
	SINIRLAR_DISINDA(1002,"Yaptığınız seçim sınırların dışındadır"),
	DUSUK_AGIRLIK (1003,"Yüklen de gel"),
	MESAI_GUNLERI_DISI (1004,"Cuma günleri kabul yapılmıyor. Başka bir gün gel"),
	GECERSIZ_KABUL_TARIHI(1005, "Geçmiş bir gunun tarihini girdiniz");
	
	private int code;
	private String message;
	
	
	
	private ErrorType(int code, String message) {
		this.code = code;
		this.message = message;
	}



	public int getCode() {
		return code;
	}



	public String getMessage() {
		return message;
	}
	
	
	
	


	
}
