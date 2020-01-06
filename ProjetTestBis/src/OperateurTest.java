/**
 * 
 */

/**
 * @author MOI
 *
 */
public class OperateurTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maVariableInt1;
		maVariableInt1 = 256;
		System.out.println(maVariableInt1);
		
		int maVariableInt2;
		maVariableInt2 = maVariableInt1;
	//	System.out.println(maVariableInt2);
		
		int maVariableInt3;
		maVariableInt3 = maVariableInt1 + maVariableInt2;
		System.out.println(maVariableInt3);
		
		
		// TODO cela est un commentaire?
		
		// Test des opérateurs
		int addition ;
		addition = 5 + 6 ;
		System.out.println(addition);
		
		int soustraction;
		soustraction = addition - 7 ;
		System.out.println(soustraction);
		
		int multiplication ;
		multiplication = addition * soustraction;
		System.out.println(multiplication);
		
		float division ;
		division = addition * multiplication / 9.666F;
		System.out.println(division);
		
		float modulo ;
		modulo = ( multiplication / division ) % 13;
		System.out.println(modulo);

	}

}
