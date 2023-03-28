public class soma {
    public static int calcularValores(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void main(String[] args) {
        int resultado = soma.calcularValores(2, 4);
        System.out.println("O resultado foi " + resultado);
    }
}
