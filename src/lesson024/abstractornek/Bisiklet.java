package lesson024.abstractornek;

public class Bisiklet extends Arac implements IBinilebilir {


	@Override
	public void bin() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void ilerle() {
		System.out.println("Bisiklet hareket ediyor.");		
	}

	@Override
	public void durma() {
		System.out.println("Bisiklet durdu.");		
	}
	

}
