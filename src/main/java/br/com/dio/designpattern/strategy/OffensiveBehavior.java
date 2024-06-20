package br.com.dio.designpattern.strategy;

public class OffensiveBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("Offensive movement");
    }
}
