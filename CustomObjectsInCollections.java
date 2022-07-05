package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CustomObjectsInCollections {
    public static void main(String[] args) {

        person p1=new person(0,"Bob");
        person p2=new person(1,"Sue");
        person p3=new person(2,"Mike");
        person p4=new person(3,"Sue");

        Map<person,Integer> map=new HashMap<>();

        map.put(p1,1);
        map.put(p2,2);
        map.put(p3,3);
        map.put(p4,4);

        for(person key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }



    }
}
