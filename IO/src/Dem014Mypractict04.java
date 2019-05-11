import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Dem014Mypractict04 {
    public static void main(String[] args) {
//        File sourcefolder=null;
//        File targetfolder=null;
//        sourcefolder=new File("H:\\新建文件夹 (2)\\test");
//        targetfolder=new File("H:\\新建文件夹 (2)\\test2");
//        File files[]=sourcefolder.listFiles();
//        for (File file:files
//             ) {
//            if (file.isDirectory())continue;
//            File newfile=new File( targetfolder+file.getName());
//            try {
//                Files.copy(file.toPath(),newfile.toPath());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

    }
    public static void copy(File sourcefolder,File targetfolder){
        sourcefolder=new File("H:\\新建文件夹 (2)\\test");
        targetfolder=new File("H:\\新建文件夹 (2)\\test2");
        File files[]=sourcefolder.listFiles();
        for (File file:files
        ) {if (file.isDirectory()==true){
            File newfile=new File( targetfolder+file.getName());
            copy(file,newfile);
        }
        else
        {
            File newfile=new File( targetfolder+file.getName());
            try {
                Files.copy(file.toPath(),newfile.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    }
}
