package principal;

public class Tablets {
	
	//variable privada de la clase
	private int num_pulsadas;

	//constructor 
	public Tablets(int num_pulsadas) {
		super();
		this.num_pulsadas = num_pulsadas;
	}
	
	//constructor vacio
	public Tablets() {
		
		
		
	}

	//getters and setters
	public int getNum_pulsadas() {
		return num_pulsadas;
	}

	public void setNum_pulsadas(int num_pulsadas) {
		this.num_pulsadas = num_pulsadas;
	}

}
