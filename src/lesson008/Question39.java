package lesson008;

import java.util.Iterator;

public class Question39 {

	public static void main(String[] args) {
		
		//Şehirleri plaka kodlarıyla birlikte bir diziye atayalım daha sonra
		// Adananın plaka kodu 01 örnek çıktısı verelim.
		
	    String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
                + "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
	    
	    /*int plakaKodu[] = {01,02,03,04,05,06,07,8,9,10,42};
	    String kent [] = {"Adana", "Adıyaman","Afyonkarahisar","Ağrı","Amasya","Ankara",
	    		"Antalya","Artvin","Aydın","Balıkesir","Konya"};
	    int j=0;
	    for (int i = 0; i < plakaKodu.length; i++) {
	    	System.out.println(kent[i]+" nın Plaka Kodu "+plakaKodu[j]);
	    	j++;
	    	*/
	    
	    String [] array=sehirler.split(";");
	
	    for (int i = 0; i < array.length; i++) {
			//System.out.println(array[i]);
	    	int index = array[i].indexOf("-");
	    	System.out.println(array[i].substring(index+1)+" nın plaka kodu "+ array[i].substring(0,index));
			
		}
		
	    
	    
	    
	}

}
