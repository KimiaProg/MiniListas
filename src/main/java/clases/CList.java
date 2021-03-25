package clases;

import java.util.Iterator;

public class CList implements MiniList {
	
	private Object obj=null;
	private Container miLista=null;

	@Override
	public boolean add(Object elemento) throws NullPointerException {
		if(elemento==null) {
			throw new NullPointerException();
		}
		obj=elemento;
		//return this.set((this.size()) + 1, elemento);
		return true;
	}

	@Override
	public boolean contains(Object elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int posicion) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int posicion(Object elemento) {
		int devolver = 0;
		int cont = 0;
		for (Object ob : this) {
			if (elemento == ob) {
				devolver = cont;
				break;
			}
			cont++;
		}
		return devolver;
	}

	@Override
	public int size() {
		int cont = 0;
		for (Object ob : this) {
			cont++;
		}
		return cont;
	}

	@Override
	public void clear() {
		for (Object ob : this) {
			ob = null;
		}

	}

	@Override
	public boolean set(Object element, int posicion) {
		int cont=0;
		boolean devolver=false;
		for(Object o:this) {
			if(cont==posicion) {
				o=element;
				devolver= true;
			}
			cont++;
		}
		return devolver;
	}

	@Override
	public Object get(int posicion) {
		Object obj=null;
		int cont=0;
		for(Object o:this) {
			if(cont==posicion) {
				obj=o;
			}
			cont++;
		}
		return obj;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private class Container {
		Object obj=null;
		Container next = null;
	}


}
