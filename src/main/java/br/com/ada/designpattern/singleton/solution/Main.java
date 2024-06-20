package br.com.ada.designpattern.singleton.solution;

public class Main {
    public static void main(String[] args) {
        saveTheDate("Monday");
        saveTheDate("Friday");
    }

    public static void saveTheDate(String day){
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.fillDay(day);
        System.out.println(agenda.getDays());
    }
}
