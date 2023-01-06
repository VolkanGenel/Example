package lesson020;

public class Ates extends Pokemon {
private String atesgücü;


@Override
public String toString() {
	return "Ates [atesgücü=" + atesgücü + "]";
}

public void pokedex() {
	
	System.out.println("=========================");
	System.out.println("PokeDex");
	System.out.println("id= " + getId());
	System.out.println("ad= " + getAd());
	System.out.println("tür= " + getTür());
	System.out.println("can= " + getCan());
	System.out.println("guc= " + getGuc());
	System.out.println("derece= "+ getDerece());
//	System.out.println("handikap= "+ handikap[0]);
//	System.out.println("handikap= "+ handikap[1]);
	System.out.println();
	System.out.println("atesgücü= "+ this.atesgücü);
	System.out.println("=========================");
}
public Ates() {
	
}

public Ates(String atesgücü,String ad,int guc,String tür, int derece) {
	super(ad,guc,tür,derece);
	this.atesgücü=atesgücü;
}


public String getAtesgücü() {
	return atesgücü;
}





}
