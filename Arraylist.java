import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> studList=new ArrayList<>();
        studList.add(11);
        studList.add(22);
        studList.add(1);
        studList.add(10);

        System.out.println(studList);

        List<Integer> al=Arrays.asList(60,67,50,40);
        System.out.println(al);

        Collections.sort(studList);
        System.out.println(studList);

    }
}
