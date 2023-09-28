// Definició de la interfície GammaAlta
interface GammaAlta {
    boolean isGammaAlta();
}

// Classe principal per a dispositius mòbils
class DispositiuMobil {
    String marca;
    String model;
    double preuBase;

    public DispositiuMobil(String marca, String model, double preuBase) {
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
    }
}

// Classe per a tablets
class Tablet extends DispositiuMobil implements GammaAlta {
    int polsadesPantalla;

    public Tablet(String marca, String model, double preuBase, int polsadesPantalla) {
        super(marca, model, preuBase);
        this.polsadesPantalla = polsadesPantalla;
    }

    @Override
    public boolean isGammaAlta() {
        return (preuBase > 900);
    }
}

