import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//字节流缓冲区包装字节
//字符流缓冲区包装字符
public class Filereader_Filewiter {
    public static void main(String[] args) {
        FileWriter writer=null;
        FileReader reader=null;

        {
            try {
                reader=new FileReader("out\\textIO\\Demo02.txt");
                writer = new FileWriter("out\\textIO\\Demo05.txt");
                char data[]=new char[1024];
                int length=reader.read(data);
                writer.write(data,0,length);

            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                if (writer!=null) {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (reader!=null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
    FileWriter writer;
    FileReader reader;

    {
        try {
            reader=new FileReader("out\\textIO\\Demo02.txt");
            writer = new FileWriter("out\\textIO\\Demo05.txt");
            char data[]=new char[1024];
            int length=reader.read(data);
            writer.write(data,0,length);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
