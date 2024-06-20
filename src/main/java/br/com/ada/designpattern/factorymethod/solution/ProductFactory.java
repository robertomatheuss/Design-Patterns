package br.com.ada.designpattern.factorymethod.solution;

import br.com.ada.designpattern.factorymethod.DigitalProduct;
import br.com.ada.designpattern.factorymethod.EnumProductType;
import br.com.ada.designpattern.factorymethod.PhysicalProduct;
import br.com.ada.designpattern.factorymethod.Product;

public class ProductFactory {
    public static Product getInstance(EnumProductType enumProductType){
        switch (enumProductType){
            case DIGITAL:
                Product product = new PhysicalProduct();
                product.setHasPhysicalDimension(true);
                return product;
            case PHYSICAL:
                Product product1 = new DigitalProduct();
                product1.setHasPhysicalDimension(false);
                return product1;
            default:
                throw new IllegalArgumentException("Product type is not available");
        }
    }
}
