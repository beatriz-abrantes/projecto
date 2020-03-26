package projeto.helloworld ;


// TODO: Auto-generated Javadoc
/**
 * Hello world!.
 */
public class App 
{
	
	/** The number. */
	private static int number = 1;
	
	/**
	 * Gets the number.
	 *
	 * @return the number
	 */
	public static int getNumber() {
		return number;
	}
	
	/**
	 * Sets the number.
	 *
	 * @param number the new number
	 */
	public static void setNumber(int number) {
		App.number = number;
	}
	
	/**
	 * Change number.
	 */
	public static void change_number() {
		if (impar(number)) { 
			setNumber(2);
		}
	} 

	/**
	 * Impar.
	 *
	 * @param number the number
	 * @return true, if successful
	 */
	public static boolean impar(int number) {
		if (number%2!=0) {
			return true;
		}
		return false; 
	}
    
    /**
     * The main method.
     * 
     * @param args the arguments
     */
    public static void main( String[] args )
    {
    	if (number==1) {
			System.out.println( "Hello World 1!" );
			change_number();
		}
		if (number==2) {
			System.out.println( "Hello World 2!" );
		}
    }
}