package clases;

public class CList implements MiniList {

	private Object obj = null;
	private Container miLista = null;

	// <------------------------------------------------------->
	@Override
	public boolean add(Object elemento) throws NullPointerException {
		if (elemento == null) {
			throw new NullPointerException();
		}
		if (miLista == null) {
			miLista = new Container(elemento, miLista);
		} else {
			Container auxList = miLista;
			while (auxList.next != null) {
				auxList = auxList.next;
			}
			auxList.next = new Container(elemento, null);
		}
		return true;

	}

	// <------------------------------------------------------->
	@Override
	public boolean contains(Object elemento) {
		boolean devolver = false;
		Container auxList = miLista;
		while (auxList != null) {
			if (auxList.obj == elemento) {
				devolver = true;
				break;
			}
			auxList = auxList.next;
		}
		return devolver;
	}

	// <------------------------------------------------------->
	@Override
	public boolean delete(Object elemento) {
		Container auxList = miLista;
		Container anteriorList = miLista;

		while (elemento != auxList.obj) {
			anteriorList = auxList;
			auxList = auxList.next;
		}
		anteriorList.next = auxList.next;
		return true;
	}

	// <------------------------------------------------------->
	@Override
	public boolean delete(int posicion) {
		Container auxList = miLista;
		Container anteriorList = miLista;
		int cont = 0;
		while (posicion != cont) {
			anteriorList = auxList;
			auxList = auxList.next;
			cont++;
		}
		anteriorList.next = auxList.next;
		return true;
	}

	// <------------------------------------------------------->
	@Override
	public int posicion(Object elemento) {
		int devolver = -1;
		Container auxList = miLista;
		int cont = -1;
		while (auxList != null) {
			cont++;
			if (auxList.obj == elemento) {
				devolver = cont;
				break;
			}
			auxList = auxList.next;
		}

		return devolver;
	}

	// <------------------------------------------------------->
	@Override
	public int size() {
		Container auxList = miLista;
		int cont = 0;
		while (auxList != null) {
			cont++;
			auxList = auxList.next;
		}
		return cont;
	}

	// <------------------------------------------------------->
	@Override
	public void clear() {
		miLista = null;

	}

	// <------------------------------------------------------->
	@Override
	public boolean set(Object element, int posicion) {

		Container auxList = miLista;
		int cont = 0;
		while (posicion != cont) {
			auxList = auxList.next;
			cont++;
		}
		auxList.obj = element;

		return true;
	}

	// <------------------------------------------------------->
	@Override
	public Object get(int posicion) {
		Container auxList = miLista;
		int cont = -1;
		while (auxList != null) {
			cont++;
			if (cont == posicion) {
				obj = auxList.obj;
				break;
			}

			auxList = auxList.next;

		}
		return obj;
	}

	// <------------------------------------------------------->
	@Override
	public void mostrar() {
		Container auxList = miLista;
		while (auxList != null) {
			System.out.println(auxList.obj.toString());
			auxList = auxList.next;
		}
	}

	// <------------------------------------------------------->
	private class Container {
		Object obj = null;
		Container next = null;

		Container(Object obj, Container next) {
			this.obj = obj;
			this.next = next;

		}

	}

}
