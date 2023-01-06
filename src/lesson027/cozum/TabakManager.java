package lesson027.cozum;

import java.util.Random;
import java.util.Stack;

/*
 * 
 * rastgele 1 yada 2 gelicek bir secim uretece�iz 
 * sonra bu secime gore metotda bir i�lem sectirecegiz 
 * 1 gelmi�se temizle 
 * 2 gelmi�se kullan metodu cal�ss�n 
 * 
 * 
 */
public class TabakManager {

	Stack<Tabak> kirliler;
	Stack<Tabak> temizler;

	public TabakManager() {
		this.kirliler = new Stack<>();
		this.temizler = new Stack<>();
	}

	public void secimYap(int secim) {

		switch (secim) {
		case 1:
			temizle();
			break;
		case 2:
			kullan();
			break;
		default:
			break;
		}

	}

	public void rastgeleTabakOlustur() {
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			Tabak tabak = new Tabak(i + 1, random.nextBoolean());

			if (tabak.isKirliMi()) {
				kirliler.push(tabak);
			} else {
				temizler.push(tabak);
			}
		}

	}

	public void yazdir(Stack<Tabak> stack) {

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

	public void temizle() {

		if (!kirliler.isEmpty()) {
			Tabak tabak = kirliler.pop();
			tabak.setKirliMi(false);
			temizler.push(tabak);
			System.out.println(tabak.getId() + " idli tabak temizlenmi�tir");
		} else {

			System.out.println("Kirli tabak kalmam��t�r");
			kullan();
		}

	}

	public void kullan() {

		if (!temizler.isEmpty()) {
			Tabak tabak = temizler.pop();
			tabak.setKirliMi(true);
			kirliler.push(tabak);
			System.out.println(tabak.getId() + " idli tabak kullan�lm��t�r");
		} else {

			System.out.println("Temiz tabak kalmam��t�r");
			temizle();
		}

	}

}
