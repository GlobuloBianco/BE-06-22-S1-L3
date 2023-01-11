package classeScolastica;

public class esercizioTeoria {
	
	static Studente[] students;
	
	public static void main(String[] args) {
		students = new Studente[]{
			new Studente("Mario", "Rossi", new double[] {4.5,5.0,6.5}, 'm' ),
			new Studente("Luigi", "Verdi", new double[] {5.6,7.0,6.5}, 'm' ),
			new Studente("Giulia", "Midoli", new double[] {7.0,8.5,6.0}, 'f' ),
			new Studente("Serena", "Bianchi", new double[] {4.5,5.0,6.5}, 'f' ),
		};
		
		students[0].printAvgVote();
		stampaMigliore();
		stampaMiglioreByGender('m');
		stampaMiglioreByGender('f');
		stampaMiglioreByGender('d');
	}
	
	static void stampaMiglioreByGender(char gender) {
		Studente best = new Studente("", "", new double[] {0}, gender);
		for (int i = 0; i < students.length; i++) {
			
			if (students[i].getAvgVote() > best.getAvgVote() && students[i].genere == gender) {
				best = students[i];
			}
		}
		
		String message = "";
		
		switch (best.genere) {
			case 'm':
				message += "lo studente ";
				break;
			case 'f':
				message += "la studentessa ";
				break;
			default:
				System.out.println("errore");
				
		}
		
		if (!message.equals("")) {
			//System.out.println(message + "migliore è: " + best.getFullname() + " con la media di: " + best.getAvgVote());
			System.out.printf("%s migliore è: %s con la media di: %.1f. %n"
									, message, best.getFullname(), best.getAvgVote());
		}
		//System.out.println("lo studente " + gender + " migliore è: " + best.getFullname());
	}
	
	static void stampaMigliore() {
		Studente best = students[0];
		for (int i = 0; i< students.length; i++ ) {
			if (students[i].getAvgVote() > best.getAvgVote()) {
				best = students[i];
			}
		}
		System.out.println("Studente migliore è " + best.getFullname());
	}
}

/*
Creare un'applicazione che simula una "classe scolastica".
Realizzare un Main per eseguire l'applicazione e una classe Student nel package school.objects

Lo studente avrà: nome, cognome, array di voti (double), genere (m/f)
metodi: getFullname(), getAvgVote()

Nel main, realizzare un array di 5 studenti con valori a piacere.
Tramite apposite strategie algoritmiche:

Determinare: lo studente migliore della classe.
Determinare: la studentessa migliore della classe.
Determinare: il/la migliore in assoluto della classe.
*/