package br.com.ada.designpattern.prototype.solution;

import br.com.ada.designpattern.prototype.Button;

public class  ButtonFactory {
    public static Button getInstance(Button prototype){
        Button clone = new Button();
        clone.setColor(prototype.getColor());
        clone.setHeight(prototype.getHeight());
        clone.setWidth(prototype.getWidth());
        clone.setBorderType(prototype.getBorderType());
        return clone;
    }
}
