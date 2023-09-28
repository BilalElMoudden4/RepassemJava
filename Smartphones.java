package principal;

public class Smartphones extends Dispositivos {

	// variables de clase smartphones
	private String SO;
	private boolean acelerometro = false;
	private boolean gps = true;

	// constructor
	public Smartphones(String marca, String modelo, int precio_base, String sO, boolean acelerometro, boolean gps) {
		super(marca, modelo, precio_base);
		SO = sO;
		this.acelerometro = acelerometro;
		this.gps = gps;
	}
        
        
        //Marco Antonio
        public double calcularPrecioFinal() {
        double precioFinal = super.calcularPrecioFinal();
        // Si tiene acelerómetro, se incrementa un 10%
        if (acelerometro) {
            precioFinal *= 1.10;

            // Si además tiene GPS, se incrementa un 5% adicional
            if (gps) {
                precioFinal *= 1.05;
            }
        }

        return precioFinal;
    }
        //Marco Antonio
        
        
	// constructor vacio
	public Smartphones() {
		super();
	}

	public String getSO() {
		return SO;
	}

	public void setSO(String sO) {
		SO = sO;
	}

	public boolean isAcelerometro() {
		return acelerometro;
	}

	public void setAcelerometro(boolean acelerometro) {
		this.acelerometro = acelerometro;
	}

	public boolean isGps() {
		return gps;
	}

	public void setGps(boolean gps) {
		this.gps = gps;
	}

	@Override
	public String toString() {
		return "Smartphones [SO=" + SO + ", acelerometro=" + acelerometro + ", gps=" + gps + ", getMarca()="
				+ getMarca() + ", getModelo()=" + getModelo() + ", getPrecio_base()=" + getPrecio_base() + "]" + "Precio Final: " + calcularPrecioFinal() + " Euros";
	}

}