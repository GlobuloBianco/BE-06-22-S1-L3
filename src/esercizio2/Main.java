package esercizio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String num;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un numero da 0 - 3");
		num = scanner.nextLine();
		scanner.close();

		switch (num) {
		case "0":
			System.out.println("Hai zero €");
			break;
		case "1":
			System.out.println("Hai uno €");
			break;
		case "2":
			System.out.println("Hai due €");
			break;
		case "3":
			System.out.println("Hai tre €");
			break;
		default:
			System.err.println("Errore, input non valido.");

		}
	}

}

/*
 * Esercizio #2 - switch Scrivere un programma che chiede un intero in ingresso
 * e lo stampa in lettere se il valore € compreso tra 0 e 3, altrimenti stampa
 * un messaggio d'errore usando il costrutto switch.

 */