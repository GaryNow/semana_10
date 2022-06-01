package clase;

public class Persona {
	// Atributos privados
	private int codigo;
	private String nombre;
	private double peso;
	private double estatura;
	// Constructor
	public Persona(int codigo, String nombre, double peso, double estatura) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.peso = peso;
		this.estatura = estatura;
	}
	// Métodos get - set
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public double imc() {
		return peso/(estatura*estatura);
	}
}
