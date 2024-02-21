import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputDemo {
    public static void main(String[] args) throws IOException {

        OutputStream output=new FileOutputStream("output.txt");
        String data="This text will be written in the file";
        output.write(data.getBytes());
        output.close();

    }
}
