package lesson037_Exception;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek2 {

	/**
	 * throw // istisna fırlatmak için kullanıyoruz // kendi koşullarımıza uygulamak özelliştirmek için
	 * Checked-- // bir istisna fırlatmasını zorunlu hale getiriyoruz.
	 * unchecked-- //bir zorunluluk yok.
	 * extends RunTimeException 
	 * 
	 * 1- throw fırlatalım topla2 methodu yazalım sonra bir tane de nullu kontrol eden ve null pointer exception
	 * fırlatan bir method yazalım sonra bu kontrol methodu toplam2 nin içinde kullanalım.
	 */
	/**
	 * Bir method ile dışarıdan bir index degeri alalım sonra o indextedki değeri yazdıralım
	 * hata varsa try catch ile yakalayalım.
	 * 
	 * 2- Array üzerinde gezelim sayısal değerleri integere cevirip bir toplama işlemi yapacağız
	 * yani toplama methodu yazacağız en sonunda toplam ve hata sayısını yazdıralım.
	 */
	public static String[] array = { "a","10","bc",null,"20"}; 
	
	public static void main(String[] args) {
		//arrayDon(4);	
		//toplayarakArrayDon();
		//Utility utility = new Utility();
		//System.out.println(utility.stringTarihAlma());
		//System.out.println(Utility.intDegerAlma("Lütfen Bir Değer Giriniz"));
		toplayarakArrayDon4(array);
	}
	
	public static void arrayDon(int index) {
		try {
			System.out.println(array[index]);	
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.toString());
		} catch (InputMismatchException e) { //değeri int aldığımız içi gerek kalmayacak
			System.out.println(e.toString());
		}  
		 
	}
	
	public static void toplayarakArrayDon() {
		int hataSayisi=0;
		int i=-1;
		boolean kontrol = false;
		int toplam =0;
		
		for (String string : array) {
			try {
				i++;
				int deger = Integer.parseInt(array[i]);
				toplam += deger;
				kontrol = false;
			} catch (Exception e) {
				hataSayisi++;
				System.out.println(e.toString());
				
			}  
		
		}
		System.out.println("Toplam...........: "+toplam);
		System.out.println("Hata Sayısı......: "+hataSayisi);	
	}
	
	public static void toplayarakArrayDon2(String[] array) {
		int hataSayisi=0;
		int i=-1;
		boolean kontrol = false;
		int toplam =0;
		for (String string : array) {
			try {
				i++;
				nullCheck(string);
				int deger = Integer.parseInt(string);
				toplam += deger;
				kontrol = false;
			} catch (Exception e) {
				hataSayisi++;
				System.out.println(e.toString());	
			}
		
		}
		System.out.println("Toplam...........: "+toplam);
		System.out.println("Hata Sayısı......: "+hataSayisi);	
	}
	
	  public static void toplayarakArrayDon3(String[] array) {
	        int toplam = 0;
	        int sayac = 0;
	        String deger2 = "bos";
	        for (String string : array) {
	            try {
	                deger2 = "bos";
	                deger2 = nullCheck2(string);
	                int deger = Integer.parseInt(deger2);
	                toplam += deger;
	            } catch (Exception e) {
	                System.out.println(e.toString());
	                sayac++;
	            } finally {
	                System.out.println("finally:" + deger2);
	            }
	        }
	        System.out.println("toplam= " + toplam);
	        System.out.println("hata sayısı= " + sayac);
	    }
	  
	  
	  public static void toplayarakArrayDon4(String[] array) {

		  int toplam = 0;
	        int sayac = 0;
	        String deger2 = "bos";
	        for (String string : array) {
	            try {
	                deger2 = "bos";
	                deger2 = nullCheck4(string);
	                int deger = Integer.parseInt(deger2);
	                toplam += deger;
	            } catch (NullKontrolException e) {
	                System.out.println(e.toString());
	                sayac++;
	            } finally {
	                System.out.println("finally:" + deger2);
	            }
	        }
	        System.out.println("toplam= " + toplam);
	        System.out.println("hata sayısı= " + sayac);
	    }
	        
	public static String nullCheck (String deger) {
		if (deger == null) {
			throw new NullPointerException("Null değer olamaz!");
		}
			return deger;
		
	}
	
	public static String nullCheck2 (String deger) throws Exception {
		if (deger == null) {
			throw new Exception("Null değer olamaz!");
		}
			return deger;
		
	}
	public static String nullCheck3 (String deger) throws NullPointerException {
		if (deger == null) {
			throw new NullPointerException("Null değer olamaz!");
		}
			return deger;	
	}
	
	public static String nullCheck4 (String deger) throws NullPointerException{
		if (deger == null) {
			throw new NullKontrolException("Null değer olamaz!");
		}
			return deger;	
	}
}
