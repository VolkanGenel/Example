package lesson024.database;

public class Oracle implements IDatabase{

	@Override
	public void veriEkle() {
		System.out.println("Oracle veritabanına veri eklendi");		
	}

	@Override
	public void veriSil(int index) {
		System.out.println("Oracle veritabanından veri silindi");
	}

	@Override
	public void veriGuncelle() {
		System.out.println("Oracle veritabanında veri güncenlendi");
		
	}

	@Override
	public void verileriListele() {
		System.out.println("Oracle veritabanından veriler getiriliyor");
		
	}

	@Override
	public void login() {
		System.out.println("Oracle veritabanına bağlanıldı ");		
	}
}
