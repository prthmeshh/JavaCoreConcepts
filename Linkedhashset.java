import java.util.Set;
import java.util.*;


public class Linkedhashset {
    public static void main(String[] args) {
        Set<String> names= new LinkedHashSet<>();
        names.add("david");
        names.add("peter");
        names.add("adam");
        names.add("boris");


          for(String name:names){
            System.out.println(name);
        }
    }
}
