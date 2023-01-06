package lesson019.pokemon;

public class Pokemon {
	long id;
	String ad;
	String tür;
	int can;
	int guc;
	int derece;
	String[] handikap;
	Kullanici kullanici;
	
	public Pokemon() {
	can=100;	
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
		System.out.println("=========================");
	}
}
