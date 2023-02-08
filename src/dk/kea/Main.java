package dk.kea;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<String, String> courseMap = new TreeMap<>();
        courseMap.put("Hardy", "Systemudvikling");
        courseMap.put("Claus", "Teknik");
        courseMap.put("David", "Virksomhed");
        courseMap.put("Patrick", "Virksomhed");
        courseMap.put("Jarl", "Programmering");

        for (String teacher:courseMap.keySet()){
            String course = courseMap.get(teacher);
            System.out.println(teacher + " underviser i " + course);
        }
    }
}
