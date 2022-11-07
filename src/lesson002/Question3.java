package lesson002;

public class Question3 {

	public static void main(String[] args) {
/*
 * Türk Lirası amount alalım
 * Onu dolara çevirelim
 */
		
	double Türk_Lirası = 1, Dolar = 18.60 * Türk_Lirası;
	double AmountTL= 20000 * Türk_Lirası;
	double AmountUsd = AmountTL / Dolar;
	System.out.println(AmountUsd);
		
		
	}

}
