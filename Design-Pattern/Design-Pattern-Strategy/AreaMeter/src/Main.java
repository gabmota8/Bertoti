public class Main {
    public static void main(String[] args) {
        CalculadoraDeArea calculadora = new CalculadoraDeArea();

        // Calcular área de um Retângulo
        calculadora.setForma(new Retangulo(5, 10));
        System.out.println("Área do Retângulo: " + calculadora.calcularArea());

        // Calcular área de um Círculo
        calculadora.setForma(new Circulo(7));
        System.out.println("Área do Círculo: " + calculadora.calcularArea());

        // Calcular área de um Triângulo
        calculadora.setForma(new Triangulo(6, 8));
        System.out.println("Área do Triângulo: " + calculadora.calcularArea());
    }
}
