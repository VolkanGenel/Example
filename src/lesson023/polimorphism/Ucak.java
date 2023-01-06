package lesson023.polimorphism;

public class Ucak extends Arac implements IUcabilir {

	@Override
	public void uc() {
		System.out.println("Uçak uçuyor.");		
	}
	
	@Override
	public void ilerle() {
		System.out.println("Ucak hareket ediyor.");		
	}

	@Override
	public void durma() {
		System.out.println("Ucak durdu.");		
	}

	
}
