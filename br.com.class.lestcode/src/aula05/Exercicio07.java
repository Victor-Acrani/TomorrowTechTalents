package aula05;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] compras = new String[5][2];
        double[] parcelas = new double[15];
        int index = 0;
        System.out.println("cadastre 15 compras");
        double totalAvista = 0;
        double totalParcelado = 0;

        for (int i = 0; i < compras.length; i++) {
            System.out.println("Digite o valor da compra.");
            compras[i][0] = sc.nextLine();
            System.out.println("Forma de pagamento. 'v' à vista e 'p' parcelado em 3x.");
            compras[i][1] = sc.nextLine();

            if (compras[i][1].equalsIgnoreCase("v")){
                totalAvista += Double.parseDouble(compras[i][0]);
            } else if (compras[i][1].equalsIgnoreCase("p")) {
                totalParcelado += Double.parseDouble(compras[i][0]);
                parcelas[index] = Double.parseDouble(compras[i][0])/3;
                index++;
            }
        }
        sc.close();

        double totalCompras = totalAvista + totalParcelado;
        System.out.println("Total de compras à vista R$: " + totalAvista);
        System.out.println("Total de compras a prazo R$: " + totalParcelado);
        System.out.println("Total de compras R$: " + totalCompras);

        index = 0;
        while (parcelas[index] !=0){
            System.out.println("Valor da primeira parcela da " + (index+1) + "° compra parcelada: R$" + parcelas[index]);
            index++;
        }
    }
}
