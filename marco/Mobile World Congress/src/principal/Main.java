package principal;



public class Main {

	public static void main(String[] args) {

		//Objetos creados
		Smartphones mobil1 = new Smartphones("Apple", "13", 100, "IOS", true, false);
		Tablets table1 = new Tablets("Samsung" , "a500", 700, 200);
		Otros_DIspositivos Reloj = new Otros_DIspositivos ("Huawei" , "XR" , 100, "Reloj");
		Smartphones mobil2 = new Smartphones("Samsung", "S20", 900, "Android", false, true);
		Tablets table2 = new Tablets("Apple" , "XS", 300, 3000);
		
                Dispositivos movil1 = new Dispositivos("Samsung", "S10", 300);
		//prueba impresion de datos
		System.out.print(table1);

	}

}