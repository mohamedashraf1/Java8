package stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {

    // filter -------> conditional check
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("mohamed");
        list.add("ahmed");
        list.add("zein");
        list.add("malek");
        list.add("hossam");

        for (String s : list){
            if(s.startsWith("m")){
                System.out.println(s);
            }
        }
        System.out.println("----------------------");
        list.stream().filter(t -> t.startsWith("m")).forEach(t -> System.out.println(t));
        System.out.println("----------------------");
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        map.entrySet().stream().filter(k -> k.getKey()%2 == 0).forEach(obj->System.out.println(obj));

    }
}
