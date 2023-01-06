package lesson027.cozum;

/*
 * id de�eri tutaca��z
 * daha sonra bir kirli olp olmad���n� tutan bir de�i�ken tutaca��z 
 * 
 * rastgele 10 tane tabak uretecegiz 
 * (tabak nesnesi olusurken kirli veya temzi olmas� rastgele olacak)
 * 
 * daha sonra temizleri bir stack i�ine alal�m kirlileri ba�ka bir stacak i�ine alal�m 
 * 
 * metot i�lemlerini tabak s�n�f�nda de�ilde manager s�nf�nda yapabiliriz 
 * 
 * 
 */
public class Tabak {

	private int id;
	private boolean kirliMi;

	public Tabak() {
		// TODO Auto-generated constructor stub
	}

	public Tabak(int id, boolean kirliMi) {
		super();
		this.id = id;
		this.kirliMi = kirliMi;
	}

	public int getId() {
		return id;
	}

	public boolean isKirliMi() {
		return kirliMi;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setKirliMi(boolean kirliMi) {
		this.kirliMi = kirliMi;
	}

	@Override
	public String toString() {
		return "Tabak [id=" + id + ", kirliMi=" + kirliMi + "]";
	}

}
