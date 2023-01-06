package lesson025.odev;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	

	 String[] yemeklistesi = new String[Yemek.values().length];	
	 String[] iceceklistesi = new String[Icecek.values().length];	
	 String[] corbalistesi = new String[Corba.values().length];	
	 String[] tatlilistesi = new String[Tatli.values().length];	
	 List<String> menu;
	 
	 
	 public Menu() {
		
		this.menu =new ArrayList<>();
	
	 }
	 
	 public void anaMenu() {
		 
		 System.out.println("Menüleri Görüntüle");
			urunleriListele();
			System.out.println(menu);
	
	 }
	 
	 public void urunleriListele() {
		 
		 for (int i = 0; i < Gunler.values().length; i++) {
			menu.addAll(Gunler.values()[i].sofra);
			
		}
	 }
	 
}
