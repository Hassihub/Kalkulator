// Kalkulator versjon 0, kun rar addisjon og multiplikasjon
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Kalkulator {
	

	public static void main(String[] args) {
		// skriv java setninger her

		// Leser inn hel fra brukeren
		String talltekst = showInputDialog("Gi heltall:");
		int tall = parseInt(talltekst);

		// Utskrift
		String utTekst = "Sum: " + tall + " + " + tall + " = " + (tall+tall) + "\n" + "Produkt: " + tall + " * " + tall + " = " + (tall*tall);
		showMessageDialog(null, utTekst);

					
		}
	}
