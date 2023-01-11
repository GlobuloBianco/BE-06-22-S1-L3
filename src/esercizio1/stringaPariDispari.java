package esercizio1;

public class stringaPariDispari {
	//- stringaPariDispari, che accetta una stringa e ritorna true se il numero di caratteri è pari e false se il numero di caratteri è dispari.
	public static String stringaPariDispari(String a) {
		int num = a.length();
		boolean calcolo = (num % 2 == 0) ? true : false;
		String result = "Il risultato di " +a + " è " + num + " quindi: " + calcolo;
		return result;
	}
}
