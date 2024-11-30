import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaMoedas consultaMoedas = new ConsultaMoedas();
        Moedas novaMoedas = consultaMoedas.dolar();

        while (true) {
            System.out.println("""
                    
                    *******************************************
                    Seja bem vindo/a ao conversor de Moedas =)
                    
                    1) Dolar =>> Peso Argentino.
                    2) Peso Argentino =>> Dolar. 
                    3) Dolar =>> Real Brasileiro.
                    4) Real Brasileiro  =>> Dolar.
                    5) Dolar =>> Peso Colombiano.
                    6) Peso Colombiano =>> Dolar.
                    7) Sair.
                    Escolha uma opção valida:
                    *******************************************
                    """);
            int opcao = leitura.nextInt();
            leitura.nextLine();

            if (opcao >= 1 && opcao <= 6) {
                System.out.println("Digite o valor: ");
                double valor = leitura.nextDouble();

                switch (opcao) {
                    case 1 -> {
                        System.out.println(valor + " Dolares equivalem a: " + valor * novaMoedas.ARS() + " Pesos Argentinos");
                        if (valor <= 1) {
                            System.out.println(" Dolar equivale a: " + valor * novaMoedas.ARS() + " Pesos Argentinos");
                        }
                    }
                    case 2 -> System.out.println(valor + " Pesos argentinos equivalem a: " + valor / novaMoedas.ARS() + " Dolares");
                    case 3 -> {
                        System.out.println(valor + " Dolares equivalem a: " + valor * novaMoedas.BRL() + " Reais");
                        if (valor <= 1) {
                            System.out.println(" Dolar equivale a: " + valor * novaMoedas.BRL() + " Reais");
                        }
                    }
                    case 4 -> System.out.println(valor + " Reais equivalem a: " + valor / novaMoedas.BRL() + " Dolares");
                    case 5 -> {
                        System.out.println(valor + " Dolares equivalem a: " + valor * novaMoedas.COP() + " Pesos Colombianos");
                        if (valor <= 1) {
                            System.out.println(" Dolar equivale a: " + valor * novaMoedas.COP() + " Pesos Colombianos");
                        }
                    }
                    case 6 -> System.out.println(valor + " Pesos Colombianos equivalem a: " + valor / novaMoedas.COP() + " Dolares");
                }
            } else if (opcao == 7) {
                System.out.println("Operação finalizada");
                break;
            } else {
                System.out.println("Operação invalida, digite novamente!!");
            }
        }
    }
}