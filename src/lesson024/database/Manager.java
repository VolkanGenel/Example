package lesson024.database;

import java.util.Scanner;


public class Manager {

	Scanner sc;
	int secim=0;
//	Mysql mysql;
//	Oracle oracle;
	IDatabase database;
	
	public Manager() {
//		this.mysql = new Mysql();
	}
	
	public Manager(IDatabase database) {
		this.database = database;
	}
	public void menu() {
		
		System.out.println("1- Veri Ekle");
		System.out.println("2- Veri Sil");
		System.out.println("3- Veri GÜncelle");
		System.out.println("4- Verileri Listele");
		System.out.println("0- Çıkış");
	
	}
		public void calistir() {
			
		do {
		System.out.println("*******************");
		database.login();	
		menu();
		secim = Utility.intDegerAlma("Lütfen bir secim yapınız");
		switch (secim) {
		case 0: System.out.println("Çıkış Yapıldı"); break;
		case 1: database.veriEkle(); break;
		case 2: database.veriSil(secim); break;
		case 3: database.veriGuncelle(); break;
		case 4: database.verileriListele(); break;
		default: System.err.println("Hatalı Secim Yaptınız");
		}
	} while (secim!=0);
	}

}
