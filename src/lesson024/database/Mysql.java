package lesson024.database;

public class Mysql implements IDatabase {

	
	@Override
	public void veriEkle() {
		System.out.println("Mysql veritabanına veri eklendi");		
	}

	@Override
	public void veriSil(int index) {
		System.out.println("Mysql veritabanından veri silindi");
	}

	@Override
	public void veriGuncelle() {
		System.out.println("Mysql veritabanında veri güncenlendi");
		
	}

	@Override
	public void verileriListele() {
		System.out.println("Mysql veritabanından veriler getiriliyor");
		
	}

	@Override
	public void login() {
		System.out.println("Mysql veritabanına bağlanıldı ");		
	}
}
