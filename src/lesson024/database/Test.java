package lesson024.database;

public class Test {

	/**
	 * Mysql database bir sınıf oluşturmanızı istiyorum
	 * bu sınıfa bir interface yazacağız.
	 * ekleme silme getirme ve gunvelleme metotları olsun
	 * 
	 * bir manager sınıfı yazalım burada menumuz olsun
	 * 
	 * 1- veri ekle
	 * 2- veri sil
	 * 3- veri guncelle
	 * 4- verileri getir
	 * 
	 * secim yapıp bu metotları çalıştıracağız
	 */
	
	public static void main(String[] args) {
		
//		Manager manager = new Manager(new Oracle());
//		manager.calistir();
		menu();
	}
			
	public static void menu() {
		
		Manager manager;
	       int secim = 0;
	        do {
	            System.out.println("1-Mysql");
	            System.out.println("2-Oracle");
	            secim = Utility.intDegerAlma("Lütfen Hangi veri tanını kullanıcağınızı seciniz");

	           switch (secim) {
	            case 1:
	                Mysql mysql = new Mysql();
	                manager = new Manager(mysql);
	                mysql.login();
	                manager.calistir();
	                break;
	            case 2:
	                Oracle oracle = new Oracle();
	                manager = new Manager(oracle);
	                oracle.login();
	                manager.calistir();
	                break;
	           default:
	                break;
	            }
	       } while (secim != 0);
	}
}
