package lesson020;

public class Test {

	public static void main(String[] args) {
	
	Pokemon pokemon = new Pokemon();
	System.out.println(pokemon.toString());

	
	pokemon.setAd("Charizard");
	pokemon.setCan(100);
	pokemon.setId(1);
	pokemon.setGuc(220);
	pokemon.setTür("ateş");
	pokemon.setDerece(3);
	pokemon.pokedex();
	Ates atesPokemonu = new Ates("yüksek", "Charmander", 100, "ateş", 1);
	atesPokemonu.pokedex();

			
	/*	
	Ates atesPokemonu = new Ates("yüksek");
	atesPokemonu.setAd("Charmander");
	atesPokemonu.setCan(60);
	atesPokemonu.setTür("ateş");
	atesPokemonu.setDerece(1);
	atesPokemonu.setId(2);
	atesPokemonu.setGuc(120);
	System.out.println("Ates gücü.....: "+atesPokemonu.getAtesgücü());

	String[] array = {"Su","Hava"};
	atesPokemonu.setHandikap(array);
	atesPokemonu.pokedex();
	System.out.println(atesPokemonu.getHandikap()[0]);
	System.out.println(pokemon.toString());
*/	
//	Pokemon pokemon2 = new Pokemon("Pikachu","Elektrik",100);
//	pokemon2.pokedex();
	
//	Su suPokemonu = new Su();

	}

}
