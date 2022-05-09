package Modulo2.aula02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaJogador {

    public static void main(String[] args) {

        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastre os jogadores do seu time de futebol.");
        boolean executarApp = true;

        while (executarApp){

            System.out.println("Digite 1-> Cadastrar jogador, 2-> Listar jogadores, 3-> Usar métodos do jogador, 4-> Fechar aplicação");
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Quantos jogadores você quer cadastrar?");
                    int numeroJogadores = sc.nextInt();
                    for (int i = 0; i < numeroJogadores; i++){
                        jogadores.add(cadastarJogador(sc));
                    }
                    break;
                case 2:
                    System.out.println("Lista de jogadores cadastrados.");
                    listarJogadores(jogadores);
                    break;
                case 3:
                    if (!jogadores.isEmpty()){
                        int acao = menuAcaoJogador(sc);
                        System.out.println("Lista de jogadores cadastrados.");
                        listarJogadores(jogadores);
                        Jogador jogadorRecuperado = recuperarJogador(jogadores,sc);
                        executarAcaoJogador(jogadorRecuperado, acao, sc);
                    } else {
                        System.out.println("Favor cadastrar jogadores antes de executar ações.");
                    }
                    break;
                case 4:
                    System.out.println("Fechando aplicação.");
                    executarApp = false;
                    break;
                default:
                    System.out.println("Digite uma opção válida por favor.");
                    break;
            }
        }
        sc.close();
    }

    //----------------MÉTODOS---------------------------------
    private static Jogador cadastarJogador(Scanner sc){

        Scanner scanner = sc;
        System.out.println("Digite o ID do jogador.(int)");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o NOME do jogador.(String)");
        String nome = scanner.nextLine();
        System.out.println("Digite o APELIDO do jogador. (String)");
        String apelido = scanner.nextLine();
        System.out.println("Digite a DATA DE NASCIMENTO do jogador. (dd/MM/yyyy)");
        String dataNascimento = scanner.nextLine();
        String[] split;
        split = dataNascimento.split("/");
        LocalDate data = LocalDate.of( Integer.parseInt(split[2]), Integer.parseInt(split[1]), Integer.parseInt(split[0]));
        System.out.println("Digite a numero do jogador. (String)");
        int numero = scanner.nextInt();
        sc.nextLine();
        System.out.println("Digite a POSIÇÃO do jogador. (String)");
        String posicao = scanner.nextLine();
        System.out.println("Digite a QUALIDADE do jogador. (int)");
        int qualidade = scanner.nextInt();
        System.out.println("Digite o número de CARTÕES AMARELOS do jogador. (int)");
        int cartoesAmarelos = scanner.nextInt();
        System.out.println("Digite o número de CARTÕES VERMELHOS do jogador. (int)");
        int cartoesVermelhos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite se o jogador está suspenso.(sim/nao)");
        String suspenso = scanner.nextLine();
        boolean jogadorLiberado;
        if (suspenso.equals("sim")){
            jogadorLiberado = false;
        }else {
            jogadorLiberado = true;
        }

        System.out.println("cadastro feito com sucesso!");
        return new Jogador(id, nome, apelido, data, numero, posicao, qualidade, cartoesAmarelos, cartoesVermelhos, jogadorLiberado);
    }

    private static void listarJogadores(List<Jogador> jogadores){

        if (jogadores.isEmpty()){
            System.out.println("Não existe jogador cadastrado.");
        } else {
            jogadores.forEach(jogador -> System.out.println(jogador));
        }
    }

    private static Jogador recuperarJogador(List<Jogador> jogadores, Scanner scanner) {

        boolean executar = true;
        Jogador jogadorEscolhido = null;

        while (executar){
            System.out.println("Insira o ID do jogador.");
            int id = scanner.nextInt();

            for (int i = 0; i < jogadores.size(); i++) {
                if (jogadores.get(i).getId() == id){
                    jogadorEscolhido = jogadores.get(i);
                }
            }

            if (jogadorEscolhido != null){
                executar = false;
                System.out.println("Jogador encontrado!");
                System.out.println(jogadorEscolhido);
            } else {
                System.out.println("Favor inserir um ID cadastrado.");
            }
        }
        return jogadorEscolhido;
    }

    private static int menuAcaoJogador(Scanner scanner){

        boolean executar = true;
        int acao = 0;

        while (executar){
            System.out.println("Qual ação você deseja fazer?");
            System.out.println("1-> Aplicar cartão amarelo. 2-> Aplicar cartão vermelho. 3-> Cumprir suspensão.");
            System.out.println("4-> Sofrer lesão. 5-> Executar treinamento. 6-> Verificar se jogador está suspenso.");
            acao = scanner.nextInt();

            if (acao < 1 || acao > 6){
                System.out.println("Digite um opção válida por favor.");
            } else {
                executar = false;
                System.out.println("Ação escolhida: " + acao);
            }
        }
        return acao;
    }

    private static void executarAcaoJogador(Jogador jogador, int acao, Scanner scanner){

        if (acao == 1){
            System.out.println("Digite o número de cartões amarelo");
            int cartoes = scanner.nextInt();
            jogador.aplicarCartaoAmarelo(cartoes);
            System.out.println(cartoes +" cartões amarelos aplicados no jogador de ID: " +jogador.getId());
        } else if (acao == 2){
            jogador.aplicarCartaoVermelho();
            System.out.println("Cartão vermelho aplicado no jogador de ID: " +jogador.getId());
        } else if (acao == 3) {
            jogador.cumprirSuspencao();
            System.out.println("Suspensão cumprida pelo jogador de ID: " +jogador.getId());
        } else if (acao == 4) {
            jogador.sofrerLesao();
            System.out.println("Lesão sofrida pelo jogador de ID: " +jogador.getId());
        } else if (acao == 5) {
            jogador.executarTreinamento();
            System.out.println("Treinamento executado pelo jogador de ID: " +jogador.getId());
        } else {
            System.out.println("Jogador de ID " + jogador.getId() + " " +(jogador.verificarCondicaoDeJogo() ?"NÃO PODE JOGAR":"PODE JOGAR"));
        }
    }
}


