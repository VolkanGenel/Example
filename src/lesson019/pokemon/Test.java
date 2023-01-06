package lesson019.pokemon;

public class Test {

	public static void main(String[] args) {
	
	Pokemon pokemon = new Pokemon();
	
	
	pokemon.ad="Charizard";
//	pokemon.can = 120;
	pokemon.id = 1;
	pokemon.guc=220;
	pokemon.tür = "ateş";
	pokemon.derece = 1;
	pokemon.pokedex();
		
	Ates atesPokemonu = new Ates();
	atesPokemonu.ad="Charmander";
	atesPokemonu.atesgücü = "düşük";
//	atesPokemonu.can = 80;
	atesPokemonu.tür = "ateş";
	atesPokemonu.derece = 1;
	atesPokemonu.id=2;
	atesPokemonu.guc=120;
	atesPokemonu.handikap = new String[2];
	atesPokemonu.handikap[0] = "Su";
	atesPokemonu.handikap[1] = "Hava";
	atesPokemonu.pokedex();
	
	Pokemon pokemon2 = new Pokemon("Pikachu","Elektrik",100);
	pokemon2.pokedex();
	
	Su suPokemonu = new Su();

	}

}
