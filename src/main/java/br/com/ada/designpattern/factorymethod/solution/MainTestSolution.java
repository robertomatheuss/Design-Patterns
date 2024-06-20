package br.com.ada.designpattern.factorymethod.solution;

import br.com.ada.designpattern.factorymethod.EnumProductType;
import br.com.ada.designpattern.factorymethod.Product;

public class MainTestSolution {
    public static void main(String[] args) {
        Product digitalProduct = ProductFactory.getInstance(EnumProductType.DIGITAL);

        Product physicalProduct = ProductFactory.getInstance(EnumProductType.PHYSICAL);

    }
}
