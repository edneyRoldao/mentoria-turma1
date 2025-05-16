package lambdaConceito;

@FunctionalInterface
public interface TestInterface {

    default void imprimir2() {
        System.out.println("temos um metodo default");
    }

    void imprimir();

}
