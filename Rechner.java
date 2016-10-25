/**
 * 
 */


import java.io.IOException;

/**
 * @author impact
 *
 */
public interface Rechner {

/** This method parses the two parameters as numbers, calculates
* and returns the sum, substraction, product, division and modulo
* exactly in this order.
* All results are returned as String or
* the message of the Exception is returned
* if an Exception occurred while calculating
* @param number1 first number
* @param number2 second number
 * @return 
 * @return 
* @return all results
 * @throws IOException 
 * @throws NumberFormatException 
**/
String[] rechnen(String number1, String number2);


}