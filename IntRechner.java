/**
 * @author Markus Richter
 *
 */


public class IntRechner implements Rechner {
		
		String[] ergebnis = new String[5];

		@Override
		public String[] rechnen(String number1, String number2) {
	
			Integer intnumber1 = Integer.decode(number1);
			Integer intnumber2 = Integer.decode(number2);
				
			int sum = (intnumber1 + intnumber2);
			int diff = (intnumber1 - intnumber2);
			int prod = (intnumber1 * intnumber2);
			int div = (intnumber1 / intnumber2);
			int mod = (intnumber1 % intnumber2);

			try{
				ergebnis[0] = String.valueOf(sum);
				ergebnis[1] = String.valueOf(diff);
				ergebnis[2] = String.valueOf(prod);
				ergebnis[3] = String.valueOf(div);
				ergebnis[4] = String.valueOf(mod);

			}catch(ArithmeticException e){
				System.out.println("Division durch Null geht nicht!");
			}catch(NumberFormatException e){
				System.out.println("Falsche Zeicheneingabe!");}
			return ergebnis;
			
			
	}
      
}