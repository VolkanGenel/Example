package lesson028.queue.soru2;

import java.util.PriorityQueue;
import java.util.Queue;

public class Hastane {
	
	Queue <Hasta> hastaKuyrugu = new PriorityQueue<Hasta>(); 

	
	
	public static void main(String[] args) {
		Hastane hastane = new Hastane();
		hastane.kuyruguYazdir();
	}		
		public void hastaEkle() {
			Hasta hasta1  = new Hasta ("Ayşe", ESikayet.APANDISIT);
			Hasta hasta2 = new Hasta ("Fatma", ESikayet.YANIK);
			Hasta hasta3 = new Hasta ("Ali", ESikayet.BASAGRISI);
			Hasta hasta4 = new Hasta ("Veli", ESikayet.BASAGRISI );
			Hasta hasta5 = new Hasta ("Hüseyin", ESikayet.APANDISIT );
			Hasta hasta6 = new Hasta ("Ahmet", ESikayet.YANIK);
			Hasta hasta7 = new Hasta ("Mehmet", ESikayet.APANDISIT);
			Hasta hasta8 = new Hasta ("Osman", ESikayet.BASAGRISI);
			hastaKuyrugu.add(hasta1);
			hastaKuyrugu.add(hasta2);
			hastaKuyrugu.add(hasta3);
			hastaKuyrugu.add(hasta4);
			hastaKuyrugu.add(hasta5);
			hastaKuyrugu.add(hasta6);
			hastaKuyrugu.add(hasta7);
			hastaKuyrugu.add(hasta8);
		}
		public void kuyruguYazdir () {
			hastaEkle();
			do {
				System.out.println(hastaKuyrugu.poll().toString());
			}while (hastaKuyrugu.size()>0);
		}
	
}
