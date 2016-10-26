/**
 * @author Markus Richter
 *
 */


public class IntRechner implements Rechner {
		
		@Override
		public String[] rechnen(String number1, String number2) throws NumberFormatException {
			
		String[] ergebnis = new String[5];
	
		try {	
			Integer intnumber1 = Integer.decode(number1);

			Integer intnumber2 = Integer.decode(number2);
		
				
			int sum = (intnumber1 + intnumber2);
			int diff = (intnumber1 - intnumber2);
			int prod = (intnumber1 * intnumber2);
			int div = (intnumber1 / intnumber2);
			int mod = (intnumber1 % intnumber2);


				ergebnis[0] = String.valueOf(sum);
				ergebnis[1] = String.valueOf(diff);
				ergebnis[2] = String.valueOf(prod);
				ergebnis[3] = String.valueOf(div);
				ergebnis[4] = String.valueOf(mod);
				
			} catch(NumberFormatException e) {
				e.printStackTrace();
			
			}catch(ArithmeticException e){
				e.printStackTrace();
			
			}
		return ergebnis;
	}
      
}
