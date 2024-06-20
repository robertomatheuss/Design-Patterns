package br.com.ada.designpattern.factorymethod;

public class Main {
    public static void main(String[] args) {
        Product product = new PhysicalProduct();
        product.setHasPhysicalDimension(true);

        Product product2 = new DigitalProduct();
        product2.setHasPhysicalDimension(false);


    }
}
