package br.com.ada.designpattern.prototype;

public class RedButton extends Button{
    public RedButton() {
        setColor("Red");
        setHeight(30);
        setWidth(100);
        setBorderType(EnumBorderType.SLIM);
    }
}
