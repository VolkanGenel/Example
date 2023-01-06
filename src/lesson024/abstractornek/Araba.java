package lesson024.abstractornek;

public class Araba extends Arac{

	@Override
	public void ilerle() {
		System.out.println("Araba hareket ediyor.");		
	}

	@Override
	public void durma() {
		System.out.println("Araba durdu.");		
	}
}
