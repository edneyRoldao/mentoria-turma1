package ponteiro;

import sistemabancario.Pessoa;

public class Test {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("edney", "12345");
        Pessoa p2 = new Pessoa("Joao", "98765");
        System.out.println(p1);
        System.out.println(p2);

        p1 = p2;

        System.out.println();
        System.out.println(p1);
        System.out.println(p2);

        p1.setNome("Maria");
        p1.setDocumento("7777");

        System.out.println("--------");
        System.out.println(p2.getDocumento());


    }

}
