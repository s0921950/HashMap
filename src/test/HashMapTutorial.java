package test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeMap;

public class HashMapTutorial {

    public static void main(String[] args) {
        Hashtable<Integer, String> source = new Hashtable<Integer, String>();
        HashMap<Integer, String> map = new HashMap(source);

        map.put(21, "Twenty One");
        map.put(31, "Thirty One");

        Integer key = 21;
        String value = map.get(key);
        System.out.println("========Retrieving value from HashMap========");
        System.out.println("Key: " + key + " value: " + value);

        System.out.println();
        System.out.println("========Iterating over HashMap========");
        Iterator<Integer> keySetIterator = map.keySet().iterator();

        while (keySetIterator.hasNext()) {
            Integer keyIterator = keySetIterator.next();
            System.out.println("key: " + keyIterator + " value: " + map.get(keyIterator));
        }

        System.out.println();
        System.out.println("========ContainsKey and ContainsValue Example========");
        System.out.println("Does HashMap contains 21 as key: " + map.containsKey(21));
        System.out.println("Does HashMap contains 21 as value: " + map.containsValue(21));
        System.out.println("Does HashMap contains Twenty One as value: " + map.containsValue("Twenty One"));

        System.out.println();
        System.out.println("========Checking if HashMap is empty========");
        boolean isEmpty = map.isEmpty();
        System.out.println("Is HashMap is empty: " + isEmpty);

        System.out.println();
        System.out.println("========Removing Objects from HashMap========");
        Integer keyRemoved = 21;
        Object valueRemoved = map.remove(keyRemoved);
        System.out.println("Following value is removed from Map: " + valueRemoved);

        System.out.println();
        System.out.println("========Sorting HashMap in Java========");
        map.put(21, "Twenty One");
        map.put(41, "Thirty One");
        System.out.println("Unsorted HashMap: " + map);
        TreeMap<Integer, String> sortedHashMap = new TreeMap<Integer, String>(map);
        System.out.println("Sorted HashMap: " + sortedHashMap);

        System.out.println();
        System.out.println("========Size and Clear in HashMap========");
        System.out.println("Size of Map: " + map.size());
        map.clear(); //clears hashmap , removes all element
        System.out.println("Size of Map: " + map.size());
    }
}
