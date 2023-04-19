package pirkovic.andrea;

public class Main {

	public static void main(String[] args) {
		
		// primena funkcionalnog interfejsa i lambda niza
		//Funkcionalni interfejsi se obično koriste u Javi za predstavljanje funkcija koje mogu biti prosleđene 
		//kao argumenti metodama ili vraćene kao rezultat metode. 
		//Oni su ključni deo podrške za funkcionalno programiranje Java jezika.
		NegativanBroj nb= (n)->(n<0);
		if (nb.jeNegativan(-5)) {
			System.out.println("Broj je negativan");}
			else {
				System.out.println("Broj je pozitivan");
				
			}
			
		}

	}

//Kreirati program za unos vrednosti sa konzole,
//smeštanje u kolekciji LinkedList ispisavanje smeštenih vrednosti.
//štampa: for, napredna for, iterator
