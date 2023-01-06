package lesson038;



import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Uygulama {

	/**
	 * 1- bir yuk yeri secme methodumuz olsun
	 * bu method limandaki yukler arrayinden bir yer belirlesin kendime
	 * eger sınır dışı ise hatayı yakalayalım
	 * 
	 * 2- Kendi exception sınıfımızı yaratalım () LimanAppException
	 * daha sonra seçtiğimiz indexteki yer null değilse hata fırlatacağız.
	 * "Seçtiğiniz yer dolu" şeklinde.
	 * 
	 * 3- Agırlık belirle ==> limanımız 100 kilo altı yükleri kabul etmiyor.
	 * Yukumuz bu kurala uymuyorsa bir exception fırlatalım.
	 * 
	 * 4- Limanımız Cuma günleri kabul yapmıyor bunn için metot yazacağız
	 * kabultarihikontrol
	 * cuma gunu olpu olmadığını kontrol edip cuma ise exception atın
	 * 
	 * 5- yuk olust methodunu yazalım bir yuk olusturuken aşagıdaki kontrolleri
	 * yapalım eğer kontrollerden geçiyorsa yukumuzu ekleyelim
	 */
	
	Liman liman;
	static Scanner sc = new Scanner (System.in);
	
	
	public static void main(String[] args) {
		
		 Uygulama uygulama = new Uygulama();
	        try {
	            //uygulama.yukYeriSec3();
	        	//uygulama.uygunlukTesti();
	        	//uygulama.kabulTarihi();
	        	uygulama.uygunlukTesti2(uygulama.yukYeriSec3(), uygulama.kabulTarihi());
	        } catch (Exception e) {
	            System.out.println(e.toString());
	        }
		
	}
	
		public Uygulama() {
		super();
		this.liman = new Liman();
	}


		public void yukYeriSec() {
	
		System.out.println("Lütfen bir yük yeri seçiniz");	
		int index = sc.nextInt();	
		
		try {
			Yuk yuk =liman.getYukler()[index];
		} catch (Exception e) {
		  System.out.println(e.toString());
		  System.out.println("Lütfen Sınırlar Dahilinde Bir Yer Seçiniz");
		}
		}
		
		public void yukYeriSec2() {
			
			System.out.println("Lütfen bir yük yeri seçiniz");	
			int index = sc.nextInt();	
			
			if (index<0 || index>liman.getYukler().length) {
				throw new ArrayIndexOutOfBoundsException("Lütfen sınırlar dahilinde bir yer seçiniz.");
				}
			}
		public int yukYeriSec3() {
			liman.getYukler()[0] = new Yuk ("1",100,LocalDate.now());
			System.out.println("Lütfen bir yük yeri seçiniz");	
			int index = sc.nextInt();	
			
			if (index<0 || index>liman.getYukler().length) {
				//throw new LimanAppException(ErrorType.SINIRLAR_DISINDA,"lütfen 0 ile "+ liman.getYukler().length+" arasında bir seçim yapınız");
				throw new LimanAppException(ErrorType.SINIRLAR_DISINDA);
			} else if (liman.getYukler()[index] != null) {
					throw new LimanAppException(ErrorType.DOLU_YER_SECIMI);
				} return index;			
			}
		
		public Yuk uygunlukTesti () {
			
			sc= new Scanner(System.in);
			System.out.println("Lütfen Yuk Adı Giriniz");
			String yukAd = sc.nextLine();
			System.out.println("Lütfen Yuk Ağırlığı Giriniz");
			Double agirlik = Double.parseDouble(sc.nextLine());
			
			Yuk yuk = new Yuk(yukAd,agirlik,LocalDate.now().plusDays(1));
			if (yuk.getAgirlik()<100) {
				throw new LimanAppException(ErrorType.DUSUK_AGIRLIK);
			} return yuk;
			
		}
		
		public double kantar() {
	        System.out.println("Lütfen bir agırlık giriniz");
	        double kantarAgirlik = sc.nextDouble();
	        if (kantarAgirlik < 100) {
	            throw new LimanAppException(ErrorType.DUSUK_AGIRLIK);
	        }
	        return kantarAgirlik;
	    }
		
		public LocalDate kabulTarihi () {
			sc = new Scanner(System.in);
			System.out.println("Lütfen bir tarih giriniz");
			LocalDate date = LocalDate.parse(sc.nextLine());
			if (date.isBefore(LocalDate.now()))
				throw new LimanAppException(ErrorType.GECERSIZ_KABUL_TARIHI);	
			else if ((date.getDayOfWeek().equals(DayOfWeek.FRIDAY))) {
				throw new LimanAppException(ErrorType.MESAI_GUNLERI_DISI);
			}
			return date;
		}
		
			public void uygunlukTesti2 (int index, LocalDate date) {
			
			sc= new Scanner(System.in);
			System.out.println("Lütfen Yuk Adı Giriniz");
			String yukAd = sc.nextLine();
			System.out.println("Lütfen Yuk Ağırlığı Giriniz");
			Double agirlik = Double.parseDouble(sc.nextLine());
			
			Yuk yuk = new Yuk(yukAd,agirlik,date);
			if (yuk.getAgirlik()<100) {
				throw new LimanAppException(ErrorType.DUSUK_AGIRLIK);
			} 
			liman.getYukler()[index] = yuk;
			for (Yuk element : liman.getYukler()) {
				System.out.println(element);
			}
			
		}
	
}
