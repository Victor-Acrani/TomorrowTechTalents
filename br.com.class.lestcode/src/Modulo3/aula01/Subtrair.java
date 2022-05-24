package Modulo3.aula01;

import java.util.List;

public class Subtrair implements ICalculo{
    @Override
    public Double calcular(List<Double> numeros) {
        Double subtracao = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {
            subtracao -= numeros.get(i);
        }
        return subtracao;
    }
}
