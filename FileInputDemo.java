import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputDemo {

    public static void main(String[] args) throws IOException {

        byte[] array=new byte[50];
        InputStream input=new FileInputStream("input.txt");
        // input.read(array);
        int i=input.read();
        while(i!=-1){
            System.out.print((char)i);
            i=input.read();
        }
      /*  String data = new String(array);
        System.out.println(data);
        input.close();  */

    }
}
