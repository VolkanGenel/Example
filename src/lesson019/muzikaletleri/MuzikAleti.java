package lesson019.muzikaletleri;

public class MuzikAleti {
public String ad;
public int desibel;
public int frekans;
public String tur;
public int uretimyili;
public String mensei;
public double boyut;


public MuzikAleti() {
	
}
public void goster(String adı,int uretimZamani) {
	System.out.println(ad);
	System.out.println(uretimyili);
	
}
public void cal() {

	System.out.println("Müzik Çalıyor...");
	
}

public MuzikAleti(String Mmensei, int Muretimyili, String Mad,String Mtur, double Mboyut) {
	mensei = Mmensei;
	uretimyili= Muretimyili;
	ad = Mad;
	tur = Mtur;
	boyut = Mboyut;
}

public void bilgileriGoster () {
	System.out.println("ad= "+ ad);
	System.out.println("mensei= "+ mensei);
	System.out.println("uretim tarihi= "+ uretimyili);
	System.out.println("tur= "+ tur);
	System.out.println("boyut= "+ boyut);
	System.out.println("///////////////////////////////");
}
}
