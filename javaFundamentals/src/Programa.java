import arquivo.CaixaService;
import arquivo.ContaService;

import java.util.Scanner;

public class Programa {

    static Scanner sc = new Scanner(System.in);
    static CaixaService caixaService = new CaixaService();

    public static void main(String[] args) {
        while (true) {

            var opcao = exibirMenu();

            switch (opcao) {
                case 1 -> {
                    System.out.println("cadastra selecionado");
                }
                case 2 -> {
                    System.out.println("Informe o numero da conta para o saque:");
                    int conta = sc.nextInt();

                    System.out.println("Informe o valor do saque:");
                    double valor = sc.nextDouble();

                    caixaService.saquar(conta, valor);
                }
                case 3 -> {
                    System.out.println("Informe o numero da conta para o deposito:");
                    int conta = sc.nextInt();

                    System.out.println("Informe o valor do deposito:");
                    double valor = sc.nextDouble();

                    caixaService.depositar(conta, valor);
                }
                case 4 -> {
                    System.out.println("transferencia selecionada");
                }
            }
        }

    }

    private static int exibirMenu() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println(">>>>> SISTEMA BANCARIO - CAIXA <<<<");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("SELECIONE UMA OPCAO:");
        System.out.println("1 - cadastrar conta");
        System.out.println("2 - Saque");
        System.out.println("3 - Deposito");
        System.out.println("4 - Transferencia");

        return sc.nextInt();
    }


}
