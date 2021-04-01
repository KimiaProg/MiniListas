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

	/**
	 * Cambia el elemento que está en la posición que se pasa como parametro se
	 * indica posición a cambiar se pasa elemento a introducir verdadero si se
	 * cambió, falso si no
	 */
	public boolean set(Object element, int posicion);

	/**
	 * Devuelve el elemento de la posición que se pasa como parámetro
	 */
	public Object get(int posicion);
	public void mostrar();
}
