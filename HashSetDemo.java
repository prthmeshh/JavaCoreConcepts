import java.util.HashSet;
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<String> names= new HashSet<>();
        Set<Integer> names2= new HashSet<>();
        names.add("david");
        names.add("peter");
        names.add("adam");
        names.add("boris");
        // names.add(23);

        Set<Student> StudSet=new HashSet<>();
        StudSet.add(new Student(101,"Rohan",21,'A'));
        StudSet.add(new Student(102,"Samir",20,'B'));
        StudSet.add(new Student(103,"Aditya",22,'C'));
        StudSet.add(new Student(104,"Ranjan",29,'A'));
        StudSet.add(new Student(101,"Rohan",21,'A'));

        for(Student stud:StudSet){
            System.out.println(stud.getStudId()+" "+stud.getStudName());
        }


     /*   Iterator<String> it=names.iterator();

          while(it.hasNext()){
            String str=(String)it.next();
            System.out.println(it.next());
        } */


     /*   for(String name:names){
            System.out.println(name);
        }

      */



    }
}
