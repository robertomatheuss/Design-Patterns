package br.com.ada.designpattern.factorymethod;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Product {
    private int price;
    private String name;
    private boolean hasPhysicalDimension;

}
