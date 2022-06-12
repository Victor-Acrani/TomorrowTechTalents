package Modulo3.aula03.Part2.interfaces;

import Modulo3.aula03.Part1.interfaces.IStockedItem;

import java.util.List;

public interface IDiscount {

    double checkBookDiscount(List<IStockedItem> items, double bill);
}
