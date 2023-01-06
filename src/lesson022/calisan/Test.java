package lesson022.calisan;

/**
 * 
 * 
 * 
 * -- M�hendislerimiz olacak
 * 
 * isim soyiisim i� unvani maa�� enz az iki constructr istiyorum (isim soy isim)
 * (isim soyisim maa�)
 * 
 * maa�� zamm� metodu olacak
 * 
 * maa� default en az 10000 1000 12000 aras� unvan muhendis eger maa��
 * 1200-17000 aras�nda ise k�deml� muhendis 1700den yuksek ise uzman muhendis
 * e�er maaa�� 1000 kucuk ise stajyer ve
 * 
 * zam oran�na ek olarak 250tl bonus alacaklar
 * 
 * 
 *
 * -- ofis �al��anlar� olacak
 * 
 * isim soyiisim i� unvani maa��
 * 
 * en d���k �al��an maa�� 8000 8000 1200 aras� �al��an 12000 den sonra� kidemli
 * cal�asan 8000den az ise stajyer
 * 
 * 
 *
 */
public class Test {

	public static void main(String[] args) {

		OfisCalisani ofisCalisani = new OfisCalisani("Mustafa", "Ozturk");
		System.out.println(ofisCalisani.getMaas());

		System.out.println(ofisCalisani.getUnvan());
		System.out.println(ofisCalisani.getMaas());

		OfisCalisani ofisCalisani2 = new OfisCalisani("Tuba", "Ozturk", 13000);
		System.out.println(ofisCalisani2.getMaas());

		System.out.println(ofisCalisani2.getUnvan());
		System.out.println(ofisCalisani2.getMaas());
		Muhendis muhendis = new Muhendis("Zeliha", "�al��o�lu");
		
		System.out.println(muhendis.getUnvan());
		System.out.println(muhendis.getMaas());
		Muhendis muhendis2 = new Muhendis("Kemal", "�zt�rk", 15000);

		System.out.println(muhendis2.getUnvan());
		System.out.println(muhendis2.getMaas());
		System.out.println(muhendis.getClass().getSimpleName());
		
		InsanKaynaklari insankaynaklari = new InsanKaynaklari("Burhan", "Lale");
		insankaynaklari.zamYap(muhendis, 10);
		System.out.println(muhendis.getMaas());
	}
}
