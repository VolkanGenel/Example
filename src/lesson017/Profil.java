package lesson017;

public class Profil {
	
	
	// sınıfımızın özelliği
	static int id;
	
	// Nesne Özelliklerimiz (sınıfımızda oluşturduğumuz fakat nesneler tarafından kullanılan özellikler
	String profilResmi;
	String[] posts = new String[10];
	int postSayisi=posts.length;
	String username;
	String isim;
	int takipciSayisi;
	int takipSayisi;
	
public void postOlustur() {
	System.out.println("Post Oluştur");
}
public void profilDüzenle() {
	System.out.println("Profil Düzenle");
}
	
} // metotlar
