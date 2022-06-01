package arreglo;

import java.util.ArrayList;

import clase.Persona;

public class ArregloPersonas {
	// Atributo privado
	private ArrayList<Persona> per;
	// Constructor
	public ArregloPersonas() {
		per = new ArrayList <Persona> ();
    	adicionar(new Persona(123, "Ana", 19, 177));
    	adicionar(new Persona(456, "Juan", 15, 176));
    	adicionar(new Persona(789, "Pedro", 17, 175));
    	adicionar(new Persona(302, "David", 13, 174));
    	adicionar(new Persona(417, "Carlos", 20, 173));
    	adicionar(new Persona(641, "Jorge", 12, 172));
    	adicionar(new Persona(208, "María", 15, 171));
    	adicionar(new Persona(820, "José", 11, 170));
	}
	// Operaciones públicas básicas
	public void adicionar(Persona x) {
		per.add(x);
	}
	public int tamanio() {
		return per.size();
	}
	public Persona obtener(int i) {
		return per.get(i);
	}
	// Método buscar que reciba un código y retorne la DirMem del objeto Persona que los contiene.En caso no exista retorne null.
	public Persona buscar(int x) {
		for(int i = 0; i < tamanio(); i++) {
			if(obtener(i).getCodigo() == x)	return obtener(i);
		}
		return null;
	}
	// Método eliminar que reciba la DirMem del objeto Persona y lo retire del ArrayList
	public void eliminar(Persona i) {
		per.remove(i);	
	}
	
}
