package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(5,"Five");
        map.put(0,"Zero");
        map.put(6,"Six");
        map.put(4,"Four");
        map.put(3,"Three");

        System.out.println(map);

        String test=map.get(4);
        System.out.println(test);


    }
}
