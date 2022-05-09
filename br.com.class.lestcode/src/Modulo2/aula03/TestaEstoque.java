package Modulo2.aula03;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Estoque> estoques = new ArrayList<Estoque>();
        boolean executarApp = true;

        while(executarApp){
            executarApp = menuEstoque(scanner, estoques);
        }
        scanner.close();
    }
    //--------------------------------METODOS------------------------------------------------------------
    private static boolean menuEstoque(Scanner scanner, ArrayList<Estoque> estoques){

        System.out.println("Escolha a opção");
        System.out.println("1-> Criar novo estoque. 2-> Selecionar Estoque. 3-> Fechar aplicação.");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao){
            case 1:
                System.out.println("Digite o nome do estoque.");
                String nome = scanner.nextLine();
                estoques.add(new Estoque(nome, new ArrayList<Produto>()));
                System.out.println("Estoque criado com sucesso.");
                return true;
            case 2:
                if (!estoques.isEmpty()){
                    System.out.println("Estoques cadastrados.");
                    listarEstoque(estoques);
                    Estoque estoqueSelecionado = recuperarEstoque(estoques,scanner);
                    menuProdutos(scanner,estoqueSelecionado);
                } else  {
                    System.out.println("Não há estoques cadastrados");
                }
                return true;
            case 3:
                System.out.println("Fechando aplicação.");
                return false;
            default:
                System.out.println("Digite uma opção válida.");
                return true;
        }

    }

    private static void listarEstoque(ArrayList<Estoque> estoques) {
        estoques.forEach(estoque -> System.out.println(estoque));
    }
    
    private static Estoque recuperarEstoque (ArrayList<Estoque> estoques, Scanner scanner) {

        boolean executar = true;
        Estoque estoqueRecuperado = null;

        while(executar){

            System.out.println("Digite o ID do estoque que você quer acessar.");
            int id = scanner.nextInt();

            for (int i = 0; i < estoques.size(); i++) {
                if (estoques.get(i).getId() == id){
                    estoqueRecuperado = estoques.get(i);
                }
            }

            if (estoqueRecuperado != null){
                System.out.println("Estoque encontrado: " + estoqueRecuperado.getNome());
                System.out.println();
                executar = false;
            } else {
                System.out.println("Digite um ID válido.");
                System.out.println();
            }
        }
        return estoqueRecuperado;
    }

    public static void menuProdutos (Scanner scanner, Estoque estoque){

        boolean executar = true;
        System.out.println("---------------------------------------------------------------");
        System.out.println("Estoque " + estoque.getNome() + " acessado. Escolha uma ação.");
        int id;
        String nome;
        String secao;
        String tipo;
        int quantidadeEstoque;
        String marca;
        Produto produtoSelecionado;

        while(executar){
            System.out.println("1-> Cadastrar produto. 2-> Listar produtos do estoque. 3-> Atualizar produto. 4-> Deletar produto.");
            System.out.println("5-> Voltar para o Menu Estoques.");

            int acao = scanner.nextInt();
            scanner.nextLine();

            switch (acao){
                case 1:
                    System.out.println("Digite o nome do produto.");
                    nome = scanner.nextLine();
                    System.out.println("Digite a seção do produto.");
                    secao = scanner.nextLine();
                    System.out.println("Digite o tipo do produto.");
                    tipo = scanner.nextLine();
                    System.out.println("Digite a quantidade em estoque do produto.");
                    quantidadeEstoque = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite a marca do produto.");
                    marca = scanner.nextLine();
                    estoque.cadastrarProduto(nome, secao, tipo, quantidadeEstoque, marca);
                    break;
                case 2:
                    estoque.listarProdutos();
                    break;
                case 3:
                    estoque.listarProdutos();
                    System.out.println("Digite o id do produto produto para atualizar.");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    produtoSelecionado = estoque.encontrarProduto(id);

                    if (produtoSelecionado != null){
                        System.out.println("Digite o nome do produto.");
                        nome = scanner.nextLine();
                        System.out.println("Digite a seção do produto.");
                        secao = scanner.nextLine();
                        System.out.println("Digite o tipo do produto.");
                        tipo = scanner.nextLine();
                        System.out.println("Digite a quantidade em estoque do produto.");
                        quantidadeEstoque = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Digite a marca do produto.");
                        marca = scanner.nextLine();
                        estoque.autalizarProduto(nome, secao, tipo, quantidadeEstoque, marca, produtoSelecionado);
                    }
                    break;
                case 4:
                    estoque.listarProdutos();
                    System.out.println("Digite o id do produto produto para deletar.");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    produtoSelecionado = estoque.encontrarProduto(id);

                    if (produtoSelecionado != null){
                        estoque.deletarProduto(produtoSelecionado);
                    }
                    break;
                case 5:
                    System.out.println("Voltando para o menu Estoques");
                    executar = false;
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }
        }
    }

}
