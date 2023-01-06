package lesson027;

/*
 * id değeri tutacağız
 * daha sonra bir kirli olup olmadığını tutan bir değişken tutacağız
 * rastgele 10 tane tabak ureteceğiz
 * (tabak mesmesi olusurken kirli veya teniz olması rastgele olacak)
 * daha sonra temizleri bir stack içine alalım kirliler bir stack içine
 * alalım metot işlemlerini tabak sınıfında değil de manager sınınfında yapalım.
 *
 */
public class Tabak {
	int id;
	String temizMi;
	
	public Tabak() {
		super();
	}

	public Tabak(int id, String temizMi) {
		super();
		this.id = id;
		this.temizMi = temizMi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTemizMi() {
		return temizMi;
	}

	public void setTemizMi(String temizMi) {
		this.temizMi = temizMi;
	}	
	
}
	
	
