package lesson026;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Test {

	public static void main(String[] args) throws InterruptedException {

//		Takim takim = new Takim("Ev Sahibi");
//		System.out.println(takim.getKaleci());
//		for (AktifFutbolcu futbolcu : takim.getFutbolcular()) {
//			System.out.println(futbolcu.pasVer());
//		}
	
			Takim takim1 = new Takim ("Ev sahibi");
			Takim takim2 = new Takim ("Deplasman");
			List<Takim> takimlar = new ArrayList<>();
			takimlar.add(takim1);
			takimlar.add(takim2);
			
			Mac mac = new Mac(60000, takimlar);
			mac.mac();
			/**
			System.out.println(System.currentTimeMillis());

			Takim macaBaslayacakTakim = mac.yaziTura();
			mac.oyna(macaBaslayacakTakim);
			*/
//			Takim takim = mac.takimDegistir(mac.takimlar.get(0));
//			System.out.println(takim.getAd());
//			System.out.println(mac.takimDegistir(takim).getAd());
	}
}
