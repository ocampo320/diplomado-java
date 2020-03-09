package diplomado_java_ciclos;

public class factorial_for {

	public static void main(String[] args) {

	
		/**
		 * factorial del 1 al 10 usando for
		 */
		
		int factorial=1;
	
		
		for (int i = 1; i <=5; i++) {
			 
			factorial=i*factorial;
		}
		System.out.println("factorial= "+factorial);
	}
	
	

}
