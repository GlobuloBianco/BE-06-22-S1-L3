package esercizio3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("Scrivi qualsiasi cosa | Inserisci :q per uscire ");
	            String input = scanner.nextLine();
	            if (input.equals(":q")) {
	                break;
	            }
	            char[] carattere = input.toCharArray();

	            System.out.print("Caratteri separati dalla virgola: ");
	            for (char lettera : carattere) {
	                System.out.print(lettera + ",");
	            }
	            System.out.println();
	        }
	        scanner.close();
	}
}
/*
 
 Esercizio #3 - while Scrivere un programma che chiede di inserire una stringa
 e la suddivida in caratteri separati dalla virgola. Il programma si ripete
 fino a che l'utente non inserisce la stringa ":q"
 
*/