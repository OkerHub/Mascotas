
public class Mascotas {

	//Declarando variables 
	private long pedigri;
	private String raza;
	private float precio;
	
	//Constructor vacio
	public Mascotas() {
	}

	//Constructor con llave
	public Mascotas(long pedigri) {
		this.pedigri = pedigri;
	}
	
	//Constructor con todo
	public Mascotas(long pedigri, String raza, float precio) {
		this.pedigri = pedigri;
		this.raza = raza;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Mascotas [pedigri=" + pedigri + ", raza=" + raza + ", precio=" + precio + "]\n";
	}

	public long getPedigri() {
		return pedigri;
	}

	public void setPedigri(long pedigri) {
		this.pedigri = pedigri;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
	
	
	
	
	
	
}
