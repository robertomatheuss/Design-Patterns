package br.com.dio.designpattern.strategy;

public class DefensiveBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("Defensive Movement ");
    }
}
