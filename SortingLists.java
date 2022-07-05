package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingLists {
    public static void main(String[] args) {
        List<String> animals=new ArrayList<String>();

        animals.add("dog");
        animals.add("emu");
        animals.add("aligator");
        animals.add("snake");
        animals.add("be");

        Collections.sort(animals,new AlphabeticComp());

        System.out.println(animals);

        List<Integer> numbers=new ArrayList<>();

        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        numbers.add(31);
        numbers.add(62);

        Collections.sort(numbers);

        System.out.println(numbers);
    }

}
