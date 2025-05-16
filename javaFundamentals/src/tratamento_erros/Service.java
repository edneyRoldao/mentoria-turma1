package tratamento_erros;

import java.io.IOException;

public class Service {

    public void execute() {
        System.out.println("linha6");
        System.out.println("linha7");

        try {
            var n = converterNumberWithError("109TTT");

            System.out.println("resultado conversao: " + n);
            System.out.println("linha13");

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("erro foi capturado - NullPointerException");
        } catch (NumberFormatException e2) {
            System.out.println("erro foi capturado - NumberFormatException");
        }

        System.out.println("linha13");
        System.out.println("linha14");
    }

    public int converterNumberWithError(String value) {
        return Integer.parseInt(value);
    }

    public void print(String value) throws IOException {
        System.out.println("lancando uma exception checked");
    }

}
