package lesson024.abstractornek;

public class Gemi extends Arac {

	@Override
	public void ilerle() {
		System.out.println("Gemi ilerliyor");
		
	}

	@Override
	public void durma() {
		System.out.println("Gemi duruyor");
	}

	@Override
	public void hızıGoster() {
	super.hızıGoster();
	}
	
	
	
	

}
