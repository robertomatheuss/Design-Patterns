package br.com.dio.designpattern.strategy;

public class Main{
    public static void main(String[] args) {
        Robot robot = new Robot();

        robot.setBehavior(new OffensiveBehavior());
        robot.move();

        robot.setBehavior(new DefensiveBehavior());
        robot.move();

    }
}
