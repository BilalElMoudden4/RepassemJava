package principal;


/*Clase padre */
public class Dispositivos {

	
	//variables de clase
			private String marca;
			private String modelo;
			private int precio_base;
			
			
			
			//constructor vacio
			public Dispositivos() {}
				

			//constructor
			public Dispositivos(String marca, String modelo, int precio_base) {
				super();
				this.marca = marca;
				this.modelo = modelo;
				this.precio_base = precio_base;
			
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


			@Override
			public String toString() {
				return "Dispositivos [marca=" + marca + ", modelo=" + modelo + ", precio_base=" + precio_base + "]";
			}

		
			
			

}
