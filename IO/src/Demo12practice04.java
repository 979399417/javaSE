import java.io.*;
import java.nio.file.Files;
public class Demo12practice04 {
    public static void main(String[] args) {
        File sourcefolder=null;
        File targetfolder=null;
        sourcefolder=new File("H:\\新建文件夹 (2)\\test");
        targetfolder=new File("H:\\新建文件夹 (2)\\test2");
        File files[]=sourcefolder.listFiles();
        for(File file:files){
            if(file.isDirectory())continue;
            File newfile=new File("H:\\新建文件夹 (2)\\test2\\"+file.getName());
            try {
                Files.copy(file.toPath(),newfile.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public void copy(File sourcefolder,File targetfolder){
        if (targetfolder.isDirectory()==false)targetfolder.mkdirs();
        File files[]=sourcefolder.listFiles();
        for(File file:files){
            if(file.isDirectory()) {
                File newfile=new File(targetfolder,file.getName());
                copy(file,newfile);
            }
            else { File newfile=new File(targetfolder,file.getName());

            try {
                Files.copy(file.toPath(),newfile.toPath());


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }
}
