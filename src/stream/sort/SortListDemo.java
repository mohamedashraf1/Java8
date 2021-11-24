package stream.sort;

import stream.api.example.DataBase;
import stream.api.example.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);

// method 1
//        Collections.sort(list); // ascending
//        System.out.println(list + "\n ---------------");
//        Collections.reverse(list); // descending
//        System.out.println(list + "\n ---------------");
//
// method 2
//        list.stream().sorted().forEach(t -> System.out.println(t)); // ascending
//        System.out.println("\n ---------------");
//        list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t)); // descending
//
//method 3
//        List<Employee> employees = DataBase.getEmployees();
//
//        Collections.sort(employees, new MyComparator());
//        System.out.println(employees);

        List<Employee> employees = DataBase.getEmployees();
// method 4
//        employees.stream().sorted((a, b) ->
//                (int) (a.getSalary() - b.getSalary())
//        ).forEach(t -> System.out.println(t));
//        System.out.println("-----------");
// method 5
//        employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(t -> System.out.println(t));
        System.out.println("Ascending: ");
        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(t -> System.out.println(t));
        System.out.println("***************\ndescending: ");
        employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(t -> System.out.println(t));


    }
}


//method 3
//class MyComparator implements Comparator<Employee>{
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return  (int)(o1.getSalary() - o2.getSalary()); // ascending
//        // ( >1 if o1 bigger and so on)
//    }
//}