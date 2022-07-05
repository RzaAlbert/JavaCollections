package Collections;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<>();

        lista.add(5);
        lista.add(4);
        lista.add(3);

        System.out.println(lista.get(1));

        lista.remove(2);

        System.out.println(lista);


    }


}
