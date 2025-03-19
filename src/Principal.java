import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("******************************\n" +
                    "Menu:\n" +
                    "(1) Criar uma loja.\n" +
                    "(2) Criar um produto.\n" +
                    "(3) Sair." +
                    "\n******************************");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nINFORMAÇÕES DA LOJA");

                    System.out.println("Nome da loja: ");
                    String nome = input.nextLine();

                    System.out.println("Quantidade de funcionários: ");
                    int quantidadeFuncionarios = input.nextInt();

                    System.out.println("Salário base dos funcionários: ");
                    double salarioBaseFuncionarios = input.nextDouble();
                    input.nextLine();

                    System.out.println("Estoque de produtos: ");
                    int estoqueProdutos = input.nextInt();
                    input.nextLine();

                    System.out.println("\nENDEREÇO DA LOJA\n");

                    System.out.println("Rua: ");
                    String rua = input.nextLine();

                    System.out.println("Cidade ");
                    String cidade = input.nextLine();

                    System.out.println("Estado: ");
                    String estado = input.nextLine();

                    System.out.println("País: ");
                    String pais = input.nextLine();

                    System.out.println("CEP: ");
                    String cep = input.nextLine();

                    System.out.println("Número: ");
                    String numero = input.nextLine();

                    System.out.println("Complemento: ");
                    String complemento = input.nextLine();

                    Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

                    System.out.println("DATA DE FUNDAÇÃO DA LOJA");

                    System.out.println("Dia: ");
                    int dia = input.nextInt();

                    System.out.println("Mês: ");
                    int mes = input.nextInt();

                    System.out.println("Ano: ");
                    int ano = input.nextInt();

                    Data dataFundacao = new Data(dia, mes, ano);
                    dataFundacao.validarData(dia, mes, ano);

                    Loja loja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionarios, endereco, dataFundacao, estoqueProdutos);

                    System.out.println
                            ("\n==============================" +
                            "\nLOJA CRIADA COM SUCESSO!" +
                            "\nNome da loja: " + nome +
                            "\nQuantidade de funcionários: " + quantidadeFuncionarios +
                            "\nSalário base dos funcionários: R$" + salarioBaseFuncionarios +
                            "\nGastos com salário: R$" +quantidadeFuncionarios * salarioBaseFuncionarios +
                            "\nData de fundação da loja: " +dataFundacao +
                            "\n--- Endereço da loja --- \n" + endereco +
                            "\n==============================");
                    break;

                case 2:
                    System.out.println("\nINFORMAÇÕES DO PRODUTO");

                    System.out.println("Nome do produto: ");
                    String nomeProduto = input.nextLine();

                    System.out.println("Preço: ");
                    double precoProduto = input.nextDouble();
                    input.nextLine();

                    System.out.println("DATA DE VALIDADE (DD/MMM/AAAA)");
                    System.out.println("Dia: ");
                    int diaValidade = input.nextInt();

                    System.out.println("Mês: ");
                    int mesValidade = input.nextInt();

                    System.out.println("Ano: ");
                    int anoValidade = input.nextInt();

                    Data dataProduto = new Data(diaValidade, mesValidade, anoValidade);

                    Produto produto  = new Produto(nomeProduto, precoProduto, dataProduto);

                    System.out.println
                            ("\n==============================" +
                            "\nPRODUTO CRIADO COM SUCESSO!" +
                            "\nNome do produto: " + nomeProduto +
                            "\nPreço do produto: R$" + precoProduto +
                            "\nData de validade: " + dataProduto);

                    if (!produto.estaVencido(new Data(20, 10, 2023))) {
                        System.out.println
                                ("O produto está vencido." +
                                        "\n==============================");
                    } else {
                        System.out.println
                                ("O produto está dentro da validade." +
                                        "\n==============================");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;

                case 3:
                    boolean sair = false;
                    while (true) {
                        System.out.println("Tem certeza de que deseja sair? (Y/N)");
                        String resposta = input.nextLine();
                        if (resposta.equalsIgnoreCase("Y")) {
                            System.out.println("Saindo...");
                            sair = true;
                            break;
                        } else if (resposta.equalsIgnoreCase("N")) {
                            System.out.println("Operação cancelada. Voltando ao menu principal.");
                            break;
                        } else {
                            System.out.println("Entrada inválida. Digite 'Y' para sim ou 'N' para não.");
                        }
                    }
                    if (sair) {
                        opcao = 3;
                    } else {
                        opcao = -1;
                    }
            }
        } while (opcao != 3);
    }
}