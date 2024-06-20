package br.com.ada.designpattern.singleton;

public class Main {
    public static void main(String[] args) {
        saveTheDate("Monday");
        saveTheDate("Friday");
    }

    public static void saveTheDate(String day){
        Agenda agenda = new Agenda();
        agenda.fillDay(day);
        System.out.println(agenda.getDays());
    }
}
