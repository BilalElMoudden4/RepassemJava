    package principal;
    
// Classe Smartphone
    class Smartphones extends Dispositivos  {
        private String sO;
        private boolean acelerometro = false;
        private boolean gps = true;

        public Smartphones(String marca, String modelo, int precio_base, String sO, boolean acelerometro, boolean gps) {
            super (marca, modelo, precio_base);
            this.sO = sO;
            this.acelerometro = acelerometro;
            this.gps = gps;
        }
        
       

        public String getSO() {
            return sO;
        }

        public void setSO(String sO) {
            this.sO = sO;
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
            return "Smartphones [SO = " + sO + ", acelerometro = " + (acelerometro?"Si":"No") + ", gps = " + (gps?"Si":"No") + ", Marca = "
				+ getMarca() + ", Modelo = " + getModelo() + ", Precio base = " + getPrecio_base() + "]";
        }
    }

