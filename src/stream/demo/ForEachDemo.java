package stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("mohamed");
        list.add("ahmed");
        list.add("zein");
        list.add("malek");
        list.add("hossam");

        for (String s : list){
            System.out.println(s);
        }
        System.out.println("----------------------");
        list.stream().forEach(t -> System.out.println(t));
        System.out.println("----------------------");
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        map.forEach((key, value)->System.out.println(key+" : "+ value));
        System.out.println("----------------------");
        map.entrySet().stream().forEach(obj->System.out.println(obj));


    }
}
