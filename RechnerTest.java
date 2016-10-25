/**
 * 
 */


/**
 * @author Markus Richter
 *
 */
public class RechnerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		IntRechner intrechner = new IntRechner();
		intrechner.rechnen("20", "5");
		FloatRechner frechner = new FloatRechner();
		frechner.rechnen("50", "3");
	}
}
