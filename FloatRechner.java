/**
 * @author Markus Richter
 *
 */

        
	public class FloatRechner implements Rechner {
			
			

			@Override
			public String[] rechnen(String number1, String number2) throws NumberFormatException {
				
				String[] ergebnis = new String[5];
			try {
				Float fnumber1 = Float.parseFloat(number1);
				Float fnumber2 = Float.parseFloat(number2);
					
				Float sum = (fnumber1 + fnumber2);
				Float diff = (fnumber1 - fnumber2);
				Float prod = (fnumber1 * fnumber2);
				Float div = (fnumber1 / fnumber2);
				Float mod = (fnumber1 % fnumber2);

					ergebnis[0] = String.valueOf(sum);
					ergebnis[1] = String.valueOf(diff);
					ergebnis[2] = String.valueOf(prod);
					ergebnis[3] = String.valueOf(div);
					ergebnis[4] = String.valueOf(mod);

				}catch(ArithmeticException e){
					e.printStackTrace();
				}catch(NumberFormatException e){
					e.printStackTrace();	
			}
				return ergebnis;
		}
	      
	}
