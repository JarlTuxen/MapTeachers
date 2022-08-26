package dk.kea;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> courseMap = new HashMap<>();
        courseMap.put("Doglas", "Systemudvikling");
        courseMap.put("Janus", "Teknik");
        courseMap.put("David", "Virksomhed");
        courseMap.put("Jarl", "Programmering");

        for (String teacher:courseMap.keySet()){
            String course = courseMap.get(teacher);
            System.out.println(teacher + " underviser i " + course);
        }
    }
}
