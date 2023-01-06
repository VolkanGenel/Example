package lesson021;

public class Test {

	/**
	 * Mühendislerimiz olacak
	 * İsim
	 * soyisim
	 * iş unvanı
	 * maaşı
	 * en sz iki contructor istiyorum (isim soyisim maas=
	 * maaş zammı metodu olacak
	 * maaş default en az 10000;    10000 12000 arası uncan muhendis
	 * eger maaşı 12000-17000 arasında ise kıdemli muhendis
	 * 17000 den yuksek ise uzman muhendis
	 * eger maası 10000 den kucuk ise stajyer
	 * maası 12000 den kucuk olanlara zam oranına ek olarak 250 tl bonus alacaklar
	 * 
	 *  
	 *  ofis çalışanları olacak
	 *  isim
	 *  soyisim
	 *  iş unvanı
	 *  maaşı
	 *  8000 12000 arası calışan
	 *  12000 den sonrası kıdemli calısan
	 *  calısan 6000 den az ise stajyer
	 *  
	 *
	 */
	public static void main(String[] args) {
		Muhendis muhendis = new Muhendis(null, null);
		System.out.println(muhendis.getMaas());
		
		OfisCalisani ofiscalisani = new OfisCalisani(null, null);
		System.out.println(ofiscalisani.getMaas());	
		
		Muhendis muhendis2 = new Muhendis(null, null, 15000);
		System.out.println(muhendis2.getUnvan());
		muhendis2.zamYap();
		System.out.println(muhendis2.getMaas());
		
		OfisCalisani ofiscalisani2 = new OfisCalisani(null, null, 15000);
		System.out.println(ofiscalisani2.getUnvan());
		ofiscalisani2.zamYap();
		System.out.println(ofiscalisani2.getMaas());
	}
}
