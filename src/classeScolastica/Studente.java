package classeScolastica;

public class Studente {
	String nome;
	String cognome;
	double[] voti;
	char genere;
	
	public Studente(String nome, String cognome, double[] voti, char genere) {

		this.nome = nome;
		this.cognome = cognome;
		this.voti = voti;
		this.genere = genere;
	}
	
	public String getFullname() {
		return this.nome + " " + this.cognome;
	}
	
	public double getAvgVote() {
		double sum = 0;
		for (int i = 0; i< this.voti.length; i++) {
			sum += this.voti[i];
		}
		return sum / this.voti.length;
	}
	
	public void printAvgVote() {
		System.out.printf("%.1f%n", this.getAvgVote());
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