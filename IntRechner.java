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
//public class IntRechner implements Rechner  {
//
//	public String[] rechnen(String number1, String number2) {
//
//		int zahl1 = 0;
//		int zahl2 = 0;
//		
//		System.out.println("Jetzt wird mit Zahlen vom Typ INT gerechnet");
//        System.out.println("-------------------------------------------------------");
//        System.out.println("Eingabe der ersten Zahl :");
//        try {
//			zahl1 = Integer.decode(new BufferedReader(new InputStreamReader(System.in)).readLine());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//        System.out.println("Eingabe der zweiten Zahl :");
//        try {
//			zahl2 = Integer.decode(new BufferedReader(new InputStreamReader(System.in)).readLine());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//        
//		int ergebnis1 = zahl1 + zahl2;
//        int ergebnis2 = zahl1 - zahl2;
//        int ergebnis3 = zahl1 * zahl2;
//        int ergebnis4 = zahl1 / zahl2;
//        int ergebnis5 = zahl1 % zahl2;
//
//		
//		String[] ergebnisse = { "Summe: " + String.valueOf(ergebnis1), "Differenz: " + ergebnis2 , "Produkt: " + ergebnis3 , "Division: " + ergebnis4, "Modulo: " + ergebnis5};
//		for (String s : ergebnisse)
//		    System.out.println(s);
//		return ergebnisse;

public class IntRechner implements Rechner{
String[] ergebnis = new String[5];

/**
* @param number1 first number
* @param number2 second number
* Methode zum Ausgeben mehrerer Rechenaufgaben
**/
public String[] rechnen(String number1, String number2) {
	
	int zahl1 = Integer.decode(number1);
	int zahl2 = Integer.decode(number2);

try{
 ergebnis[0] = (zahl1 + zahl2);
 ergebnis[1] = getSubtraktion(number1, number2);
 ergebnis[2] = getProdukt(number1, number2);
 ergebnis[3] = getDivision(number1, number2);
 ergebnis[4] = getModulo(number1, number2);

}catch(ArithmeticException e){
System.out.println("Division durch Null geht nicht!");
}catch(NumberFormatException e){
System.out.println("Falsche Zeicheneingabe!");}
return ergebnis;
	}
      
}