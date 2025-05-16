package lambdaConceito;

public class Test {

    public static void main(String[] args) {

        TestInterface tf = new TestInterfaceImpl();
        tf.imprimir();

        TestInterface tf2 = () -> System.out.println("Test lambda on the fly");
        tf2.imprimir();

    }

}
