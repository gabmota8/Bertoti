import Formas.*;
import Main.CalculadoraDeArea;

public class Main {
    public static void main(String[] args) {
        // Criando a calculadora
        CalculadoraDeArea calculadora = new CalculadoraDeArea();

        // Exemplo com Retângulo
        Forma retangulo = new Retangulo(8, 10);
        calculadora.setForma(retangulo);
        System.out.println("Área do Retângulo: " + calculadora.calcularArea());

        // Exemplo com Círculo
        Forma circulo = new Circulo(5);
        calculadora.setForma(circulo);
        System.out.println("Área do Círculo: " + calculadora.calcularArea());

        // Exemplo com Triângulo
        Forma triangulo = new Triangulo(4, 10);
        calculadora.setForma(triangulo);
        System.out.println("Área do Triângulo: " + calculadora.calcularArea());
    }
}
