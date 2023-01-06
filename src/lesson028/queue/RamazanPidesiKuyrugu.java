package lesson028.queue;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class RamazanPidesiKuyrugu {

	public static void main(String[] args) {
		Random random = new Random();
		int pide = random.nextInt(10);
		Queue <String> kuyruk = new ArrayBlockingQueue <String>(pide);
		boolean isAdd;
		for (int i = 0; i < 15; i++) {
			isAdd = kuyruk.offer("Ali"+i);
			if (!isAdd)
				System.out.println("Ali"+i+" için Pide Bitti");	
		}	
	}
}
