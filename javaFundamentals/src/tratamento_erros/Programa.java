package tratamento_erros;

import java.io.IOException;

public class Programa {

    public static void main(String[] args) throws IOException {
        Service svc = new Service();
        Service2 svc2 = new Service2();

        svc.execute();
        test(svc);
        svc2.executeTwo();

        System.out.println("fim da execucao");
    }

    static void test(Service svc) throws IOException {
        svc.print("test");
    }

}
