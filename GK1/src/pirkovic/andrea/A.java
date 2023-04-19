package pirkovic.andrea;

public class A<T> { // genericka klasa.Ovde je T parametar tipa, koji 
	// ce biti zamenjen stvarnim tipom kada se napravi objekat tipa A
	
	T ob; // int ob;
	
	A(T o)// konstruktor
	{
		ob=o;
	}
	
	public void setOb(T ob)// setter
	{
		this.ob=ob;
	}
	public T getOb() {// getter
		return ob;
	}
	void prikaziTip() { // ispis tipova podataka
		System.out.println("Tip T je" + ob.getClass().getName());
		
	}
	}// Zakljucak:zamena za stvarni tip koji ce biti zadat u trenutku 
// kreiranja objekta klase A.

