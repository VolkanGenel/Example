package lesson002;

public class Question2 {

	public static void main(String[] args) {
		/*Bir ürünün fiyatında %18 kdv %15 kar olduğunu biliyoruz.
		 * Bir ürün fiyatımız olsun elimizde
		 * Bu ürün fiyatından ürünün ham fiyatını bulalım (karsız ve kdvsiz fiyatı)
		 */
		
		double fiyat = 100;
				double kdvsiz = fiyat / 1.18;
				double hamfiyat = kdvsiz / 1.15;
				
				System.out.println("Kdvsiz Fiyat....: " + kdvsiz);
				System.out.println("Ham Fiyat.......: " +hamfiyat);
				
	}
}
