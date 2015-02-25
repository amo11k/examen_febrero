
 /**
 * 
 * @author alu53381650f
 * Esta clase tiene los siguientes métodos:
 */

public interface IScreen {
    
	/**
	 *  @return este método devuelve la anchura de IScreen.
	 **/
	public int getWidth();
	
	/**
	 * 
	 * @param se le da el parámetro de tipo int, width(anchura).
	 * @return le da a IScreen una anchura.
	 */
	public void setWidth(int width);
	
	/**
	 * 
	 * @return devuelve la largaria de IScreen.
	 */
	public int getHeight();
	
	/**
	 * 
	 * @param height es un parametro de tipo entero. (altura).
	 * @return setea la altura de IScreen
	 */
	public void setHeight(int height);
	
	/**
	 * 
	 * @return devuelve un booleano si se crea o no la clase IScreen.
	 */
	public Boolean create();
	
	/**
	 * Este método inicia la clase.
	 */
	public void start();
	
	/**
	 * Este método para la clase IScreen
	 * @param acepta un boolean como parametro
	 */
	public void stop(Boolean force);
	
	/**
	 * Este metodo cierra IScreen
	 * @param acepta un boolean como parámetro
	 */
	public void close(Boolean force);
	
	/**
	 * 
	 * @return devuelve la lectura de un ICommand
	 */
	public ICommand readCommand();
	
	/**
	 * 
	 * @param command acepta como parametro un ICommand
	 * @return devuelve un booleano de si se a ejecutado el comando o no.
	 */
	public Boolean executeCommand(ICommand command);
}
