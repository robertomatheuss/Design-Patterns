package br.com.ada.designpattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Button {
    protected String color;
    protected int width;
    protected int height;
    protected EnumBorderType borderType;

}
