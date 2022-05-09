package Modulo1.aula03;

public class Exercicio03 {

    public static void main(String[] args) {

        int numero = 0;

        for (int i = 0; i < 100; i++) {

            numero ++;

            if (numero % 10 == 0) {
                System.out.println(numero + " é multiplo de 10.");
            } else {
                System.out.println(numero);
            }
        }
    }
}

