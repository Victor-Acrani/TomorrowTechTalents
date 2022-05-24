package Modulo3.aula01;

import java.util.List;

public class Multiplicar implements ICalculo{
    @Override
    public Double calcular(List<Double> numeros) {
        Double multiplicacao = numeros.stream().
                reduce(1.0, (numero1, numero2)-> numero1 * numero2);
        return multiplicacao;
    }
}
