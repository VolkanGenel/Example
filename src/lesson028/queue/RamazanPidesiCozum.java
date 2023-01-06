package lesson028.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RamazanPidesiCozum {

	  Queue<String> kuyruk = new LinkedList<>();
	  
	    public RamazanPidesiCozum() {
	        kuyrukOlustur();
	    }
	    
	    public static void main(String[] args) throws InterruptedException {
	        RamazanPidesiCozum ramazanPidesiKuyrugu = new RamazanPidesiCozum();
	        ramazanPidesiKuyrugu.pideDagıt();
	        ramazanPidesiKuyrugu.geriyeKalanlar();

	    }
	    public void kuyrukOlustur() {
	        kuyruk.offer("Ahmet");
	        kuyruk.offer("Murat");
	        kuyruk.offer("Hasan");
	        kuyruk.offer("Ozan");
	        kuyruk.offer("Zeliha");
	        kuyruk.offer("Sümeyye");
	        kuyruk.offer("Ezgi");
	        kuyruk.offer("Gizem");
	        kuyruk.offer("Oguz");
	        kuyruk.offer("Attilla");
	        kuyruk.offer("Mustafa");
	    }
	    public void pideDagıt() throws InterruptedException {
	        Random random = new Random();
	        int pideSayisi = random.nextInt(10) + 1;
	        System.out.println("Pideler Cıkıyor");
	        System.out.println("Pide sayısı= " + pideSayisi);
	        Thread.sleep(2000);

	        for (int i = 0; i < pideSayisi; i++) {
	            if (!kuyruk.isEmpty()) {
	                System.out.println(kuyruk.poll() + " pidesini aldı");
	            }
	        }
	    }
	    public void geriyeKalanlar() {
	        if (kuyruk.isEmpty()) {
	            System.out.println("Pidesini almayan musteri kalmadı");
	        } else {
	            System.out.println("Pide bitti pide alamayanlar:");
	            kuyruk.forEach(System.out::println);
	        }
	    }
}