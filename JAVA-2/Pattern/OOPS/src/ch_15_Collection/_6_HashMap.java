package ch_15_Collection;
import java.util.HashMap;
import java.util.*;

public class _6_HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        map.put("India",120);
        map.put("Us",180);
        map.put("Norway", 144);
//        map.put("India",180); //--> no duplicate keys allowed in hashmap.
        map.put("Canada",120);


        System.out.println(map);


        System.out.println("Search in hashmap ");
//        System.out.println(map.containsKey("India"));
        if(map.containsKey("Dubai") || map.containsValue(144)){
            System.out.println("Key is present");
        }
        else{
            System.out.println("Key is not present");
        }

        //get method in hashmap
        System.out.println("get method");
        System.out.println(map.get("pakistan")); //--> if key is not exist in map then return null
        System.out.println(map.get("India"));

        //remove method
        System.out.println("remove method");
        System.out.println(map.remove("India"));


        //iteration
        System.out.println("Iteration using loop print all keys");
        for(String i : map.keySet()){
            System.out.println(i);
        }
        //values
        System.out.println("Print all Values");
        for(int i : map.values()){
            System.out.println(i);
        }

        //entry set method in hashmap
        System.out.println("entrySet method in hashmap");
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.print("key "+e.getKey()+" ");
            System.out.print("Values "+e.getValue()+ " ");
            System.out.println();
        }

        //print keys and values using keySet
        System.out.println("print keys and values using keySet");
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println("Key "+key +" Values " +map.get(key) );
        }

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}