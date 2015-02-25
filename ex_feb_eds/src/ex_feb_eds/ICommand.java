package ex_feb_eds;

public interface ICommand {
	
	/**
	 * Este metodo crea un comando.
	 * @param string, acepta como un parametro una cadena de texto que dará nombre al comando
	 * @return devuelve un booleano de si se crea el comando o no
	 */
	public Boolean create(String string);
	
	/**
	 * Este método inicia un comando.
	 * @return devuelve un booleano de si se ha "runeado" el comando o no.
	 */
	public Boolean run();
}
