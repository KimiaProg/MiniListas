/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package clases;

public class Main {

	public static void main(String[] args) {
		Persona persona= new Persona("Kimi","fdf",20);
		Persona persona2= new Persona("bb","fdf",20);
		Persona persona3= new Persona("fggfdd","fdf",20);
		Persona persona4= new Persona("nnnnn","fdf",20);
		MiniList list= new CList();
		list.add(persona);
		list.add(persona2);
		list.add(persona3);
		list.add(persona4);
		System.out.println(list.size());
		if(list.get(0)==persona) {
			System.out.println("true");
		}
		if(list.get(1)==persona2) {
			System.out.println("true");
		}
		if(list.get(2)==persona3) {
			System.out.println("true");
		}
		if(list.get(3)==persona4) {
			System.out.println("true");
		}
		System.out.println(list.size());
		System.out.println(list.posicion(persona3));
		System.out.println(list.contains(persona3));
		
		
		System.out.println(list.contains(persona3));
		list.mostrar();
		//list.set(persona3, 3);
		list.delete(persona3);
		System.out.println("");
		
		
		System.out.println("");
		if(list.get(3)==persona3) {
			System.out.println("true");
		}
		list.mostrar();
		System.out.println(list.size());
	}
}
