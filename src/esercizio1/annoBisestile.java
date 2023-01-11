package esercizio1;

public class annoBisestile {
	public static void verificaBisestile(int anno) {
	    if (anno % 4 == 0) {
	        if (anno % 100 == 0) {
	            System.out.println("L'anno è 0"/*anno % 400 == 0*/); 
	        } else {
	            System.out.println("L'anno è bisestile: " + true);
	        }
	    } else {
	    	System.out.println("L'anno non è bisestile: " + false);
	    }
	}
}

/* - annoBisestile, che accetta un anno espresso come intero e ritorna true se esso è bisestile, false altrimenti. [Un anno per essere bisestile deve rispettare una delle seguenti regole:
- essere divisibile per 4
- qualora sia divisibile per 100 deve essere anche divisibile per 400
*/