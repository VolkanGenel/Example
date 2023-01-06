package lesson020;

import java.util.Arrays;

public class Pokemon {
	private long id;
	private String ad;
	private String tür;
	private int can;
	private int guc;
	private int derece;
	private String[] handikap;
	private Kullanici kullanici;
	
	public Pokemon() {
	can=100;	
	}
	
	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", ad=" + ad + ", tür=" + tür + ", can=" + can + ", guc=" + guc + ", derece="
				+ derece + ", handikap=" + Arrays.toString(handikap) + ", kullanici=" + kullanici + "]";
	}
	public Pokemon(String ad,int guc,String tür, int derece) {
		this.ad =ad;
		this.guc= guc;
		this.tür = tür;
		this.derece= derece;
		System.out.println("Pokemon [id=" + id + ", ad=" + ad + ", tür=" + tür + ", can=" + can + ", guc=" + guc + ", derece="
				+ derece + ", handikap=" + Arrays.toString(handikap) + ", kullanici=" + kullanici + "]");
		}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getTür() {
		return tür;
	}

	public void setTür(String tür) {
		this.tür = tür;
	}

	public int getCan() {
		return can;
	}

	public void setCan(int can) {
		this.can = can;
	}

	public int getGuc() {
		return guc;
	}

	public void setGuc(int guc) {
		this.guc = guc;
	}

	public int getDerece() {
		return derece;
	}

	public void setDerece(int derece) {
		this.derece = derece;
	}

	public String[] getHandikap() {
		return handikap;
	}

	public void setHandikap(String[] handikap) {
		this.handikap = handikap;
	}

	public Kullanici getKullanici() {
		return kullanici;
	}

	public void setKullanici(Kullanici kullanici) {
		this.kullanici = kullanici;
	}

	public Pokemon(long myIdi,String pokemonIsmi,String pokemonTuru) {
		
	}
	
	public Pokemon(String pokemonIsmi,String pokemonTuru, int pokemonGucu) {
	ad =pokemonIsmi;
	guc= pokemonGucu;
	tür = pokemonTuru;
	}
	
	public void pokedex() {
		
		System.out.println("=========================");
		System.out.println("PokeDex");
		System.out.println("id= " + id);
		System.out.println("ad= " + ad);
		System.out.println("tür= " + tür);
		System.out.println("can= " + can);
		System.out.println("guc= " + guc);
		System.out.println("derece= "+ derece);
//		System.out.println("handikap= "+ handikap[0]);
//		System.out.println("handikap= "+ handikap[1]);
		System.out.println();
		System.out.println("=========================");
	}
}
