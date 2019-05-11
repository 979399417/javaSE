import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Demo14searchfile {
    public void searchfile(String name){
        try {
            BufferedReader reader=new BufferedReader(new FileReader(name));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
