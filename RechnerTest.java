/**
 * @author Markus Richter
 *
 */
public class RechnerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		Rechner i = new IntRechner();
		i.rechnen("20", "5");
		Rechner f = new FloatRechner();
		f.rechnen("50", "3");
	}
}
