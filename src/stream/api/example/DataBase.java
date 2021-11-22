package stream.api.example;

import java.util.ArrayList;
import java.util.List;

// DAD layer
public class DataBase {
    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Roshan", "IT", 6000));
        list.add(new Employee(388, "Bikash", "CIVIL", 9000));
        list.add(new Employee(470, "Bimal", "DEFENCE", 5000));
        list.add(new Employee(624, "Sourav", "CORE", 4000));
        list.add(new Employee(188, "Prakash", "SOCIAL", 12000));
        return list;
    }
}
