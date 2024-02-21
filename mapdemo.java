import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class mapdemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>(10, 0.75f);
        ConcurrentHashMap <Integer, String> map2=new ConcurrentHashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");

        //updating map values
        // map.put(2,"second");
        // System.out.println(map);

        //removing element
        //map.remove(1);
        //System.out.println(map);

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            int key=entry.getKey();
            String value= entry.getValue();
            System.out.println(key+" : "+value);
        }

        Map<String,Integer> empMap=new HashMap<>();
        empMap.put("Anil",1000);
        empMap.put("James",1200);
        empMap.put("Raj",1800);
        empMap.put("Rahul",1500);

        Map.Entry<String,Integer> finalResult=empMap.entrySet().stream().sorted(Comparator.comparing(entry->entry.getValue())).collect(Collectors.toList()).get(empMap.size()-1);

        System.out.println(finalResult);

     /*   Optional<Map.Entry<String, Integer>> maxSalaryEntry = empMap.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        maxSalaryEntry.ifPresent(entry ->
                System.out.println("Employee with maximum salary: " + entry.getKey() + " - " + entry.getValue()));  */

    }


}
