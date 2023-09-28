package principal;

/*Clase padre */
public class Otros_DIspositivos extends Dispositivos {

	// variables de clase
	private String descripcion;

	// constructor vacio
	public Otros_DIspositivos() {
	}

	// constructor
	public Otros_DIspositivos(String marca, String modelo, int precio_base, String descripcion) {
		super(marca, modelo, precio_base);

		this.descripcion = descripcion;
	}

	// setters and getters

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Otros_DIspositivos [descripcion=" + descripcion + ", getMarca()=" + getMarca() + ", getModelo()="
				+ getModelo() + ", getPrecio_base()=" + getPrecio_base() + "]";
	}

}