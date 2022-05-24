package Modulo3.aula01;

import java.util.List;

public class Dividir implements ICalculo{
    @Override
    public Double calcular(List<Double> numeros) {
        Double divicao = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {
            divicao = divicao / numeros.get(i);
        }
        return divicao;
    }
}
