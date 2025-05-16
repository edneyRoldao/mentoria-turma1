public class TesteSobrecarga {

    public static void main(String[] args) {
        imprimir("test", "outro test");
        imprimir(10);
    }

    static void imprimir(String valor) {
        System.out.printf("valor: %s", valor);
    }

    static void imprimir(Integer valor) {
        System.out.printf("valor: %s", valor);
    }

    static void imprimir(String valor1, String valor2) {
        System.out.printf("valor1: %s - valor2: %s", valor1, valor2);
    }

}
