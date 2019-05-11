import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Demo11practice03 {
    //复制一个文本文件，并且保存到一个集合里面
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("out\\textIO\\Demo02.txt"));
            String data = null;
            while ((data = reader.readLine()) != null) {
                list.add(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String str:list
             ) {
            System.out.println(str);
        }

    }
}