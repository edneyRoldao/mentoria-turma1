package heranca;

public class Test {

    public static void main(String[] args) {

        Pessoa p = new PessoaFisica("Maria", "Aparecida", "71570528063");
        System.out.println(p.getDocumentoFormatado());
        System.out.println(p.getNomeCompleto());

        System.out.println("-------------------");

        Pessoa pj = new PessoaJuridica("Joao", "das Couves", "23255183000188");
        System.out.println(pj.getDocumentoFormatado());
        System.out.println(pj.getNomeCompleto());

        pj.formatarDocumento("11122233344");
        pj.formatarDocumento("11222333000166", TipoDocumento.CNPJ);

    }

}
