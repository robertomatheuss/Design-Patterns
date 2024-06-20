package br.com.ada.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

    private Map<String, Boolean> days = new HashMap<>();

    public Agenda(){
        days.put("Sunday", Boolean.TRUE);
        days.put("Monday", Boolean.TRUE);
        days.put("Tuesday", Boolean.TRUE);
        days.put("Wednesday", Boolean.TRUE);
        days.put("Thursday", Boolean.TRUE);
        days.put("Friday", Boolean.TRUE);
        days.put("Saturday", Boolean.TRUE);
    }

    public Map<String, Boolean> getDays(){
        return days;
    }

    public void fillDay(String day){
        days.replace(day,Boolean.FALSE);
    }
}
