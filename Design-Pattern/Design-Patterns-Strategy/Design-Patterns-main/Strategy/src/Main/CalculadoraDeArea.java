package Main;

import Formas.Forma;

public class CalculadoraDeArea {
    private Forma forma;

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    public double calcularArea() {
        if (forma == null) {
            throw new IllegalStateException("Forma não definida");
        }
        return forma.calcularArea();
    }
}