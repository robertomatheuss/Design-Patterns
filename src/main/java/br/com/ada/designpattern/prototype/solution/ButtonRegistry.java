package br.com.ada.designpattern.prototype.solution;

import br.com.ada.designpattern.prototype.Button;
import br.com.ada.designpattern.prototype.EnumBorderType;

import java.util.HashMap;
import java.util.Map;

public class ButtonRegistry {

    private static Map<String, Button> REGISTRY = new HashMap<>();

    static {
        Button blue = new Button();
        blue.setColor("BLUE");
        blue.setHeight(35);
        blue.setWidth(125);
        blue.setBorderType(EnumBorderType.DASHED);
        Button red = new Button();
        red.setColor("RED");
        red.setHeight(30);
        red.setWidth(100);
        red.setBorderType(EnumBorderType.THICK);

        REGISTRY.put("RED_BUTTON",red);
        REGISTRY.put("BLUE_BUTTON",blue);
    }

    public Button clone(String chave){
        return ButtonFactory.getInstance(REGISTRY.get(chave));
    }

    public static void addRegistry(String chave,Button button){
        REGISTRY.put(chave,button);
    }
}
