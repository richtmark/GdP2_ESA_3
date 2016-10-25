/**
 * 
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Markus Richter
 *
 */
public class FloatRechner implements Rechner {
	
	public String[] rechnen(String number1, String number2) throws NumberFormatException  {

		float ergebnis1, ergebnis2, ergebnis3, ergebnis4, ergebnis5;
		
		System.out.println("Jetzt wird mit Zahlen vom Typ Float gerechnet");
        System.out.println("-------------------------------------------------------");
		System.out.println("Eingabe der ersten Zahl :");
		try {
			zahl1 = Float.parseFloat(new BufferedReader(new InputStreamReader(System.in)).readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Eingabe der zweiten Zahl :");
		try {
			zahl2 = Float.parseFloat(new BufferedReader(new InputStreamReader(System.in)).readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        ergebnis1 = zahl1+zahl2;
        System.out.println("Summe : " + ergebnis1 + " ");
        ergebnis2 = zahl1-zahl2;
        System.out.println("Differenz : " + ergebnis2 + " ");
        ergebnis3 = zahl1*zahl2;
        System.out.println("Produkt : " + ergebnis3 + " ");
        ergebnis4 = zahl1/zahl2;
        System.out.println("Division : " + ergebnis4 + " ");
        ergebnis5 = zahl1%zahl2;
        System.out.println("Modulo : " + ergebnis5 + " ");
		return null;
	}
}
