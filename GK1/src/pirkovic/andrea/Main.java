package pirkovic.andrea;

public class Main {

	public static void main(String[] args) {
		
		// napravicemo objekat koji prihvata integer vrednost
		// Pravi A objekat za tip Integer
		A<Integer>intObjekat = new A <Integer>(100);
		
		// Knjiga k1= new knjiga("NDC",1100);
		intObjekat.prikaziTip();
		int vrednostIntObjekta= intObjekat.getOb();
		System.out.println("Vrednost:  "+ vrednostIntObjekta);
		System.out.println("\n");
		
		
		// Pravi A objekat za tip string
				A<String>stringObjekat = new A <String>("tekst");
		stringObjekat.prikaziTip();
		String str= stringObjekat.getOb();
		System.out.println("Vrednost " + str);
	}

}
