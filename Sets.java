package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> set1=new HashSet<>();
            set1.add("Dog");
            set1.add("Cat");
            set1.add("Snake");
            set1.add("Beaver");

        System.out.println(set1);

        set1.add("Dog");

        System.out.println(set1);


        Set<String> set2=new LinkedHashSet<String>();

        set2.add("Dog");
        set2.add("Cat");
        set2.add("Snake");
        set2.add("Beaver");

        System.out.println(set2);

        set2.add("Beaver");

        System.out.println(set2);

        Set<String> set3=new TreeSet<String>();


        System.out.println(set3.isEmpty());
        set3.add("Dog");
        set3.add("Cat");
        set3.add("Snake");
        set3.add("Beaver");

        System.out.println(set3.isEmpty());

        System.out.println(set3);

        set3.add("Beaver");

        System.out.println(set3);

        System.out.println(set2.contains("Dog"));
        System.out.println(set2.contains("Aligator"));

        System.out.println(set3);
        set3.remove("Beaver");
        System.out.println(set3);

        Set<String> set4=new TreeSet<String>(set2);

        System.out.println(set4);
        }


    }

