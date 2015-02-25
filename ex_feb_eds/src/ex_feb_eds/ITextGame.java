package ex_feb_eds;
/**
 * 
 * @author alu53381650f
 *
 *Esta clase tiene los métodos start, stop, pause y getScreen.
 */

public interface ITextGame {
	
	/**
	 * Este método inicia ITextGame
	 */
	public void start();
	
	/**
	 * Este método para la lectura de la interfaz
	 * @param force, acepta como parametro un boolean.
	 */
	public void stop(Boolean force);
	
	/**
	 * Este metodo pausa la ejecucion
	 * @param force, acepta como parametro un boolean
	 */
	public void pause(Boolean force);
	
	/**
	 * 
	 * @return devuelve un IScreen.
	 */
	public IScreen getScreen();
}
