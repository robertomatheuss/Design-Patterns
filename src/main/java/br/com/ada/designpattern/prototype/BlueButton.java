package br.com.ada.designpattern.prototype;

public class BlueButton extends Button{
    public BlueButton() {
        setColor("Blue");
        setHeight(35);
        setWidth(125);
        setBorderType(EnumBorderType.DASHED);
    }
}
