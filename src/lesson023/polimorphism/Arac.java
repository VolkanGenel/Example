package lesson023.polimorphism;

public class Arac implements IHareket {

	@Override
	public void ilerle() {
		System.out.println("Araç hareket ediyor.");		
	}

	@Override
	public void durma() {
		System.out.println("Araç durdu.");		
	}

}
