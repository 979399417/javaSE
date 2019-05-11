import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Demo13practice05 {
    public static void main(String[] args) {
        int number=0;
        ArrayList list=new ArrayList();
        BufferedReader reader=null;
        try {
            reader=new BufferedReader(new FileReader("out\\textIO\\Demo04.txt"));
            int data=0;
            while ((data=reader.read())!=-1){
                if (data=='a'||data=='A'){
                    number++;
                }

            }

            System.out.println(number);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
