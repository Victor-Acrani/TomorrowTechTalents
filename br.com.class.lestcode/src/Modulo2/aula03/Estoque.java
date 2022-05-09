package Modulo2.aula03;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private String nome;
    private List<Produto> produtos = new ArrayList<Produto>();
    private int id;
    private static int contador = 0;

    public Estoque(String nome, List<Produto> produtos) {
        this.nome = nome;
        this.produtos = produtos;
        contador++;
        this.id = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void cadastrarProduto(String nome, String secao, String tipo, int quantidadeEstoque, String marca){
        int index = 0;
        boolean produtoExiste = false;

        for (int i = 0; i < this.produtos.size(); i++) {
            if (this.produtos.get(i).getNome().equals(nome) && this.produtos.get(i).getMarca().equals(marca)) {
                index = i;
                produtoExiste = true;
            }
        }

        if (produtoExiste){
            int novaQuantidade = quantidadeEstoque + this.produtos.get(index).getQuantidadeEstoque();
            this.produtos.get(index).setQuantidadeEstoque(novaQuantidade);
            System.out.println("Quantidade de produtos em estoque atualizada.");
        } else {
            this.produtos.add(new Produto(nome, secao, tipo, quantidadeEstoque, marca));
            System.out.println("Produto "+ nome +" cadastrado no estoque "+ this.nome);
        }
    }

    public void listarProdutos(){
        System.out.println("Produtos cadastrados no estoque "+ this.nome);
        if (this.produtos.isEmpty()){
            System.out.println("Não existem produtos cadastrados.");
        } else {
            this.produtos.forEach(produto -> System.out.println(produto));
        }
    }

    public void autalizarProduto(String nome, String secao, String tipo, int quantidadeEstoque, String marca, Produto produto){
        int index = this.produtos.indexOf(produto);
        this.produtos.get(index).setNome(nome);
        this.produtos.get(index).setSecao(secao);
        this.produtos.get(index).setTipo(tipo);
        this.produtos.get(index).setQuantidadeEstoque(quantidadeEstoque);
        this.produtos.get(index).setMarca(marca);
        System.out.println("Produto atualizado.");
    }

    public void deletarProduto(Produto produto){
        int index = this.produtos.indexOf(produto);
        this.produtos.remove(index);
        System.out.println("Produto deletado.");
    }

    public Produto encontrarProduto(int id){
        Produto produtoEncontrado = null;
        boolean elementoEncontrado = false;

        for (int i = 0; i < this.produtos.size(); i++) {
            if (this.produtos.get(i).getId() == id){
                produtoEncontrado = this.produtos.get(i);
                elementoEncontrado = true;
            }
        }
        if (elementoEncontrado){
            System.out.println("Produto de ID " + id + " encontrado.");
        } else {
            System.out.println("Produto não existe no estoque.");
        }
        return produtoEncontrado;
    }

    @Override
    public String toString() {
        return "Estoque: " + this.nome + " . ID : " + this.id + ". Produtos cadastrados: " + this.produtos.size();
    }
}
