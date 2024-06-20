package br.com.ada.designpattern.singleton.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaSingletonLAZY {

    private static AgendaSingletonLAZY INSTANCE = null;

    public static AgendaSingletonLAZY getInstance(){
        if(Objects.isNull(INSTANCE)){
            INSTANCE = new AgendaSingletonLAZY();
        }
        return INSTANCE;
    }
    private Map<String, Boolean> days = new HashMap<>();

    private AgendaSingletonLAZY(){
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
