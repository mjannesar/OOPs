package CollectionFrameworkL1.Day2;

import java.util.Comparator;
import java.util.TreeSet;

public class Practice4 {
    public static void main(String[] args) {
        MyComparatorLogic mySortingOrderByName = new MyComparatorLogic();
         TreeSet set = new TreeSet();
        set.add(new Employee("Ananaya Sharma", 8));
        set.add(new Employee("Ananya gupta", 4));
        set.add(new Employee("Aditi", -1));
        set.add(new Employee("Divakar", 7));
        set.add(new Employee("Jannesar", 1));
        set.add(new Employee("Mehul", 6));
        System.out.println(set);
    }

    static  class Employee implements Comparable{
        String name;
        int id;
        Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        
        public int compareTo(Object obj) {
            Employee alreadyPresent = (Employee) obj;
            Employee newlyData = (Employee)this;
            if(newlyData.id < alreadyPresent.id) {
                return -1;
            } else if(newlyData.id > alreadyPresent.id) {
                return +1;
            } else {
                return 0;
            }
        }
        

        public String toString() {
            return name+" "+id;
        }

    }

    static  class MyComparatorLogic implements Comparator {
        public int compare(Object obj1, Object obj2) {
            Employee e1 = (Employee)obj1;
            Employee e2 = (Employee)obj2;
            // alphabetical orber by name
            return e1.name.compareTo(e2.name); // e1 < e2 (-1) & e1 > e2 (+1) same 0
        }
    }
}
