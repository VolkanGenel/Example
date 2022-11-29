package lesson017;

public class OopTekrar {

	public static void main(String[] args) {
		///class (sınıf)  ve objje (nesne)
		// sınıflarımızı oluştururken

	Profil myProfil = new Profil();
	myProfil.username="Mustafa";
	myProfil.postOlustur();
	System.out.println(myProfil.username+"-"+myProfil.postSayisi);
	
	Profil myProfil2 = new Profil();
	myProfil2.username="Burhan";

	System.out.println(myProfil2.username+"-"+myProfil2.postSayisi);

	}

}
