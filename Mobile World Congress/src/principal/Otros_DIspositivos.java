package principal;


/*Clase padre */
public class Otros_DIspositivos {

	
	//variables de clase
			private String marca;
			private String modelo;
			private int precio_base;
			private String descripcion;
			
			
			//constructor vacio
			public Otros_DIspositivos() {}
				

			//constructor
			public Otros_DIspositivos(String marca, String modelo, int precio_base, String descripcion) {
				super();
				this.marca = marca;
				this.modelo = modelo;
				this.precio_base = precio_base;
				this.descripcion = descripcion;
			}

			
			//getters and setters
			public String getMarca() {
				return marca;
			}

			public void setMarca(String marca) {
				this.marca = marca;
			}

			public String getModelo() {
				return modelo;
			}

			public void setModelo(String modelo) {
				this.modelo = modelo;
			}

			public int getPrecio_base() {
				return precio_base;
			}

			public void setPrecio_base(int precio_base) {
				this.precio_base = precio_base;
			}

			public String getDescripcion() {
				return descripcion;
			}

			public void setDescripcion(String descripcion) {
				this.descripcion = descripcion;
			}

			@Override
			public String toString() {
				return "dispositivos [marca=" + marca + ", modelo=" + modelo + ", precio_base=" + precio_base
						+ ", descripcion=" + descripcion + "]";
			}
			
			
			

}
