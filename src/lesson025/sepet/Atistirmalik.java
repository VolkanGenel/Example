package lesson025.sepet;

public enum Atistirmalik {

		Cips ("Cips", 1),
		Kola ("Kola", 2),
		Şeker ("Şeker",3),
		Yağ ("Yağ", 4),
		Un ("Un", 5),
		Ekmek ("Ekmek", 6),
		Çay ("Çay", 7),
		Yumurta ("Yumurta", 8),
		Yoğurt ("Yoğurt", 9), 
		Süt ("Süt", 10),;

		String ad;
		int no;
		Atistirmalik(String ad, int  no) {
			this.ad = ad;
			this.no = no;
		}
		public String getAd() {
			return ad;
		}
		public int getNo() {
			return no;
		}
	
}
