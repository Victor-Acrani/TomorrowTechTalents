package Modulo2.aula02;

import java.time.LocalDate;
import java.util.Random;

public class Jogador {

    private int id;
    private String nome;
    private String apelido;
    private LocalDate dataNascimento;
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoesAmarelos;
    private int cartoesVermelhos;
    private boolean suspenso;

    public Jogador (){

    }

    public Jogador (int id, String nome, String apelido, LocalDate dataNascimento, int numero, String posicao,
                    int qualidade, int cartoesAmarelos, int cartoesVermelhos, boolean suspenso){
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartoesVermelhos = cartoesVermelhos;
        this.suspenso = suspenso;
    }

    public int getId() {
        return id;
    }

    // letra B
    public boolean verificarCondicaoDeJogo(){

        if (this.cartoesAmarelos >= 3 || this.cartoesVermelhos >= 1){
            return true;
        }
       return false;
    }

    // letra C
    @Override
    public String toString() {
        return this.posicao+": "+this.numero+" - "+this.nome+
                " ("+this.apelido+") - "+this.dataNascimento+" CONDIÇÃO: "+(verificarCondicaoDeJogo() ?"NÃO PODE JOGAR":"PODE JOGAR");
    }

    // letra D
    public void aplicarCartaoAmarelo(int quantidade) {
        this.cartoesAmarelos += quantidade;
        this.suspenso = verificarCondicaoDeJogo();
    }

    public void aplicarCartaoVermelho() {
        this.cartoesVermelhos++;
        this.suspenso = verificarCondicaoDeJogo();
    }

    public void cumprirSuspencao() {
        this.cartoesAmarelos = 0;
        this.cartoesVermelhos = 0;
        this.suspenso = false;
    }

    public void sofrerLesao() {
        Random random = new Random();
        double numero = random.nextDouble();
        
        if (numero < 0.4){
            this.qualidade += -1;
        } else if (numero < 0.7) {
            this.qualidade += -2;
        } else if (numero < 0.85) {
            this.qualidade = (int) (this.qualidade*0.95);
        } else if (numero < 0.95) {
            this.qualidade = (int) (this.qualidade*0.90);
        } else {
            this.qualidade = (int) (this.qualidade*0.85);
        }

        if(this.qualidade < 0){
            this.qualidade = 0;
        }
    }

    public void executarTreinamento() {
        Random random = new Random();
        this.qualidade += random.nextInt(3)+1;
    }

}
