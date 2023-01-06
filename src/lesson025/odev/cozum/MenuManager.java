package lesson025.odev.cozum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class MenuManager {

	public ECorba corbaBelirle() {
		
		int uzunluk = ECorba.values().length;	
		return ECorba.values()[randomIndex(uzunluk)];	
	}
	
	public Enum menuBelirle (Enum []dizi) {	
		return dizi[randomIndex(dizi.length)];	 
	}
	
	public int randomIndex (int uzunluk) {
		Random random = new Random();
		return random.nextInt(uzunluk);
	}
	
	public Enum icecekBelirle (EIcecekler []dizi) {
		int uzunluk = dizi.length;
		int index = randomIndex(uzunluk);
		while (dizi[index].isAtandimi()) {
			index = randomIndex(uzunluk);
		}
		dizi[index].setAtandimi(true);
		return dizi[index];	 
	}
	public Menu menuOlustur() {
		Menu menu = new Menu();
		menu.setCorba((ECorba) menuBelirle(ECorba.values()));
		menu.setYemek((EYemek) menuBelirle(EYemek.values()));
		menu.setTatli((ETatli) menuBelirle(ETatli.values()));
		menu.setIcecek((EIcecekler) icecekBelirle(EIcecekler.values()));
//		menu.setIcecek((EIcecekler) menuBelirle(EIcecekler.values()));
		return menu;
	}
	
	public Enum menuBelirle2(Enum[] dizi) {
		Enum value = null;
		Stack<Enum> stringlist= new Stack<>();
		for (Enum deger : dizi) {
			stringlist.add(deger);
		}
			int index = randomIndex(stringlist.size());
			value = stringlist.get(index);
			stringlist.remove(index);	
		return value;
	}
	public void haftalikMenu() {
//		EGun[] gunler = EGun.values();
		//{EGun.PAZARTESİ,EGUN.SALI,EGUN.CARSAMBA.....]-}
//		for (EGun gun : gunler) {}
		
		for (EGun gun : EGun.values()) {
			System.out.println(gun.ordinal() + 1 +"-"+gun);
			System.out.println(menuOlustur());	
		}
	}
	
	
	
	public static void main(String[] args) {
		MenuManager menumanager = new MenuManager();
		menumanager.haftalikMenu();
	}
}
