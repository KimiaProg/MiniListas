package clases;

public interface MiniList {

	/**
	 * Añadir objeto a la lista
	 * 
	 * @param elemento
	 */
	public boolean add(Object elemento) throws NullPointerException;

	/**
	 * @param elemento
	 * @return Te devuleve true si el elemento existe en la lista false en caso
	 *         contrario
	 */
	public boolean contains(Object elemento);

	/**
	 * Borra el elemento recibido y
	 * 
	 * @param elemento
	 * @return te devuelve true si se ha borrado correectaento o false en el caso
	 *         contrario
	 */
	public boolean delete(Object elemento);

	/**
	 * Borra el elemento de la lista con la posicion indicada
	 * 
	 * @param elemento
	 * @return Devuelve true o false si se ha borrado correctamente
	 */
	public boolean delete(int posicion);

	/**
	 * Añade el elmento recibido en la lista en la posicion indicada
	 * 
	 * @param elemento
	 * @param posicion
	 * @return Devuelve true o false si se ha añadido correctamente
	 */
	public boolean add(Object elemento, int posicion);

	/**
	 * @param elemento
	 * @return Te devuelve la posicion del eleemnto de la lista
	 */
	public int posicion(Object elemento);

	/**
	 * @return Te devuelve la cantidad de elementos en la lista
	 */
	public int size();

	/**
	 * Borra los elementos de la lista
	 */
	public void clear();
}
