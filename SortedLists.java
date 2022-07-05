package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedLists {

    public static void testMap(Map<Integer,String> map){
        map.put(9,"fox");
        map.put(8,"snake");
        map.put(1,"turtle");
        map.put(15,"dog");
        map.put(7,"cat");

        for(Integer key:map.keySet()){
            String value=map.get(key);
            System.out.println(key+": "+value);
        }

    }
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<Integer,String>();
        TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();



       // testMap(linkedHashMap);
       testMap(hashMap);
    }
}
