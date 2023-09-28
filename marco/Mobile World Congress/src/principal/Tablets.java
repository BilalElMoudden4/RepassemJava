package principal;

public class Tablets extends Dispositivos {

	// variable privada de la clase
	private int num_pulsadas;

	// constructor
	public Tablets(String marca, String modelo, int precio_base, int num_pulsadas) {
		super(marca, modelo, precio_base);
		this.num_pulsadas = num_pulsadas;
	}

	// constructor vacio
	public Tablets() {
		super();
	}

	// getters and setters
	public int getNum_pulsadas() {
		return num_pulsadas;
	}

	public void setNum_pulsadas(int num_pulsadas) {
		this.num_pulsadas = num_pulsadas;
	}

	@Override
	public String toString() {
		return "Tablets [num_pulsadas=" + num_pulsadas + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getPrecio_base()=" + getPrecio_base() + "]";
	}

}