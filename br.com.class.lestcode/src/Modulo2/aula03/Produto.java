package Modulo2.aula03;

public class Produto {

    private String nome;
    private String secao;
    private String tipo;
    private int quantidadeEstoque;
    private String marca;
    private int id;
    private static int contador = 0;

    public Produto(String nome, String secao, String tipo, int quantidadeEstoque, String marca) {
        this.nome = nome;
        this.secao = secao;
        this.tipo = tipo;
        this.quantidadeEstoque = quantidadeEstoque;
        this.marca = marca;
        contador++;
        this.id = contador;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Nome do produto: " + this.nome + ". Seção: " + this.secao + ". Tipo: " + this.tipo
                + ". Quantidade em estoque: " + this.quantidadeEstoque + ". Marca: " + this.marca
                + ". Id do produto: " + this.id;
    }
}
