package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    private static void doTimings(String type, List<Integer> list){
        for(int i=0;i<list.size();i++){
            list.add(i);
        }

        long start=System.currentTimeMillis();
        long end=System.currentTimeMillis();

        System.out.println("Time taken"+(end-start)+"ms for "+type);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<>();
        LinkedList<Integer> linkedList=new LinkedList<>();

        doTimings("Array",lista);
        doTimings("Linked",linkedList);
    }

}
