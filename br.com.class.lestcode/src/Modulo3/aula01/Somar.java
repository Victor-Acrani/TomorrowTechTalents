package Modulo3.aula01;

import java.util.List;

public class Somar implements ICalculo{
    @Override
    public Double calcular(List<Double> numeros) {
        Double soma = numeros.stream()
                .reduce(0.0,(numero1, numero2) -> numero1 + numero2);
        return soma;
    }
}
