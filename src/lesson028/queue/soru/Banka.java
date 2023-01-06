package lesson028.queue.soru;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Müşteri kuyruğumuz olsun
 * Bu müşteri kuyruğuna müşteri ekleyeceğiz sonra da
 * müşterileri sırayla işleme alacağız 65 yaş üstü öncelikli olsun.
 * @author sezaigenel
 *
 */
public class Banka {

	Queue<Musteri> musteriKuyrugu = new PriorityQueue<Musteri>();
	static Banka banka = new Banka();
	
	public static void main(String[] args) {
		banka.kuyruguYazdir();
	}
	public void musteriEkle () {	
		Musteri musteri = new Musteri("Ayşe", "54545555454",85);
		musteriKuyrugu.add(musteri);
		musteriKuyrugu.add(new Musteri("Ali","454636364637",19));
		musteriKuyrugu.add(new Musteri("Tekin","8493926364637",71));
		musteriKuyrugu.add(new Musteri("Bahar","1246363641345",55));
		musteriKuyrugu.add(new Musteri("Ecrin","0924126364637",68));
		musteriKuyrugu.add(new Musteri("Ahmet","3523523637",27));
		musteriKuyrugu.add(new Musteri("Mehmet","321435342",38));
	}
	
	public void kuyruguYazdir () {
		musteriEkle();
//	musteriKuyrugu.forEach(System.out::println);
		do {
			System.out.println(musteriKuyrugu.remove().toString());
		}while (musteriKuyrugu.size()>0);
	}
	
	
}
