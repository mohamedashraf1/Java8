package Consumer_Predicate_Supplier;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
//        Supplier<String> supplier = () -> "hello bro";
//        System.out.println(supplier.get());

        List<String> list  = Arrays.asList();
//        System.out.println(list.stream().findAny().orElseGet(supplier));
        System.out.println(list.stream().findAny().orElseGet(() -> "didn't find any elements in the list"));

    }
}

//public class SupplierDemo implements Supplier<String> {
//    @Override
//    public String get() {
//        return "hi bro";
//    }
//
//    public static void main(String[] args) {
//        Supplier<String> supplier = new SupplierDemo();
//        System.out.println(supplier.get());
//    }
//}
