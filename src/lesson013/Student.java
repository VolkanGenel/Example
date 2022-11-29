package lesson013;

/*bir isimleri bir de numaraları
öğrenci numaraları 1 den başlasın 
yeni öğrenci kayıt oldukça numaraları
artsın.
*/

public class Student {
	
	 String ad;
	    static int numara;

	   public void kayit() {



	       numara += 1;
	        System.out.println(ad + " adlı öğrenci " + numara + " nosu ile kayıt olmuştur");
	   }
}
