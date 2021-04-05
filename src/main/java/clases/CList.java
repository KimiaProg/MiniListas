package clases;

public class CList implements MiniList {

	private Container miLista = null;

	// <------------------------------------------------------->
	@Override
	public boolean add(Object elemento) throws NullPointerException {
		if (elemento == null) {
			throw new NullPointerException();
		} else {
			if (miLista == null) {
				miLista = new Container(elemento, miLista);
			} else {
				Container auxList = miLista;
				while (auxList.next != null) {
					auxList = auxList.next;
				}
				auxList.next = new Container(elemento, null);
			}
		}
		return true;
	}

	// <------------------------------------------------------->
	@Override
	public boolean contains(Object elemento) {
		boolean devolver = false;
		Container auxList = miLista;
		while (auxList.next != null && elemento!=auxList.obj) {
			auxList = auxList.next;
		}
		if (auxList.obj == elemento) {
			devolver = true;
		}
		return devolver;
	}

	// <------------------------------------------------------->
	@Override
	public boolean delete(Object elemento) {
		Container auxList = miLista;
		Container anteriorList = miLista;
		boolean devolver = false;
		while (auxList.next != null && elemento != auxList.obj) {
			anteriorList = auxList;
			auxList = auxList.next;
		}
		if (elemento == auxList.obj) {
			anteriorList.next = auxList.next;
			devolver = true;
		}
		return devolver;
	}

	// <------------------------------------------------------->
	@Override
	public boolean delete(int posicion) {
		Container auxList = miLista;
		Container anteriorList = miLista;
		boolean devolver = false;
		int cont = 0;
		while (auxList != null && posicion != cont) {
			anteriorList = auxList;
			auxList = auxList.next;
			cont++;
		}
		if (posicion == cont) {
			anteriorList.next = auxList.next;
			devolver = false;
		}
		return devolver;
	}

	// <------------------------------------------------------->
	@Override
	public int posicion(Object elemento) {
		Container auxList = miLista;
		int cont = 0;
		while (auxList.next != null && auxList.obj != elemento) {
			cont++;
			auxList = auxList.next;
		}
		if(auxList.obj!=elemento) {
			cont=-1;
		}
		return cont;
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

		boolean devolver = false;
		Container auxList = miLista;
		int cont = 0;
		while (posicion != cont && auxList.next != null) {
			cont++;
			auxList = auxList.next;
		}
		if (posicion == cont) {
			auxList.obj = element;
			devolver = true;
		}
		return devolver;
	}

	// <------------------------------------------------------->
	@Override
	public Object get(int posicion) {
		Object obj = null;
		Container auxList = miLista;
		int cont = -1;
		while (auxList != null && obj == null) {
			cont++;
			if (cont == posicion) {
				obj = auxList.obj;
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
