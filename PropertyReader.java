import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class PropertyReader {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("db.properties");
        Properties props=new Properties();
        props.load(reader);
        System.out.println(props.getProperty("username"));


        Locale loc= Locale.getDefault();
        System.out.println(loc);
    }
}
